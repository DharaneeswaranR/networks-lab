import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(8020);
        Socket s = ss.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintStream ps = new PrintStream(s.getOutputStream());

        try {
            while (true) {
                System.out.print("Server: ");
                String smsg = in.readLine();
                ps.println(smsg);
                System.out.println("Client: " + br.readLine());
            }
        } catch (Exception e) {
            System.out.println("Client has closed");
        }

        ss.close();
    }
}

/* Output

Server: Hello!
Client: Hi
Server: I love you
Client: OMG I love you too!
Server: Sorry it was a dare
Client: *cries in corner*

*/