import java.io.*;
import java.net.*;

public class HttpProtocol {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.google.com/");
            URLConnection urlconn = url.openConnection();
            urlconn.connect();
            BufferedReader br = new BufferedReader(new InputStreamReader(urlconn.getInputStream()));
            FileWriter file = new FileWriter("output.html");
            int i;

            while ((i = br.read()) != -1) {
                file.write((char)i);
            }

            file.close();
        } catch (IOException e) {
            System.out.println(e);
        }     
    }
}
