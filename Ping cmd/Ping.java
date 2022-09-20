import java.io.*;
import java.util.*;

public class Ping {
    public static void runSystemCommand(String Command) {
        try {
            Process p = Runtime.getRuntime().exec(Command);
            BufferedReader InputStream = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String s;
            while ((s = InputStream.readLine()) != null) {
                System.out.println(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String Ip = "localhost";
        runSystemCommand("ping " + Ip);
        Date date = new Date();
        System.out.println(date);
    }
}

/*

Pinging DESKTOP-GNN8VMQ [::1] with 32 bytes of data:
Reply from ::1: time<1ms
Reply from ::1: time<1ms 
Reply from ::1: time<1ms
Reply from ::1: time<1ms

Ping statistics for ::1:
    Packets: Sent = 4, Received = 4, Lost = 0 (0% loss),
Approximate round trip times in milli-seconds:
    Minimum = 0ms, Maximum = 0ms, Average = 0ms
Tue Sep 20 23:33:00 IST 2022

*/