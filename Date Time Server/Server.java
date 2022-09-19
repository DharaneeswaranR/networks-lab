import java.io.*;
import java.net.*;
import java.util.*;

public class Server {
    public static void main(String args[]) throws Exception {
        ServerSocket ss = new ServerSocket(8020);
        Socket s = ss.accept();
        PrintStream pw = new PrintStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

        try {
            Date date = new Date();
            pw.println(date);
            System.out.println(br.readLine());
        } catch (Exception e) {
            System.out.println("The exception is: " + e);
        }

        pw.close();
        ss.close();
    }
}