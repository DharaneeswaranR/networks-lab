import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket s = new Socket(InetAddress.getLocalHost(), 8020);
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            PrintStream ps = new PrintStream(s.getOutputStream());
            System.out.print("Enter filename: ");
            String file = in.readLine();
            ps.println(file);
            String str;
            System.out.println("The contents of file are: ");

            while ((str = br.readLine()) != null) {  
                System.out.println(str);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
