import java.io.*;
import java.net.*;

public class Server {
    public static void main(String args[]) {
        try {
            ServerSocket ss = new ServerSocket(8020);
            Socket s = ss.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintStream ps = new PrintStream(s.getOutputStream());
            File file = new File(br.readLine());
            String content = "";

            if (file.isFile()) {
                BufferedReader fr = new BufferedReader(new FileReader(file));
                String str;

                while ((str = fr.readLine()) != null) {
                    content += str + '\n';
                }

                ps.println(content);
                System.out.println(br.readLine());
                fr.close();
            } else {
                ps.println("File doesnt exist");
            }

            ss.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
