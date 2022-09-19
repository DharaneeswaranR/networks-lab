import java.io.*;
import java.net.*;

public class Server {
    public static void main(String args[]) throws IOException {
        ServerSocket ss = new ServerSocket(8020);
        Socket s = ss.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintStream ps = new PrintStream(s.getOutputStream());

        try {
            System.out.println("Ip address of client: " + br.readLine());
            ps.println("Received client address.");
        } catch (IOException e) {
            System.out.println(e);
        }

        ss.close();
    }
}

/* Output

Ip address of client: DESKTOP-GNN8VMQ/192.###.#.##

*/
