import java.io.*;
import java.net.*;

public class Client {
    public static void main(String args[]) {
        try {
            Socket soc = new Socket(InetAddress.getLocalHost(), 8020);
            BufferedReader br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            PrintStream pw = new PrintStream(soc.getOutputStream());
            String date = br.readLine();

            System.out.println("The data in the server is: " + date);
            pw.println("Client Ack: Received Date and Time");
        } catch (IOException e) {
            System.out.println("The exception is: " + e);
        }
    }
}
