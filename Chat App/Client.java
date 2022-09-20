import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket(InetAddress.getLocalHost(), 8020);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintStream ps = new PrintStream(s.getOutputStream());

        try {
            while (true) {
                String smsg = br.readLine();
                System.out.println("Server: " + smsg);
                System.out.print("Client: ");
                String cmsg = in.readLine();
                ps.println(cmsg);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
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
