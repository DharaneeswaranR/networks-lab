import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket s = new Socket(InetAddress.getLocalHost(), 8020);
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintStream ps = new PrintStream(s.getOutputStream());

            ps.println(InetAddress.getLocalHost());
            System.out.println(br.readLine());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

/* Output

Received client address.

*/
