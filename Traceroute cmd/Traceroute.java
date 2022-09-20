import java.io.*;

public class Traceroute {
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
        String addr = "11.1.0.1";
        runSystemCommand("tracert " + addr);
    }
}

/*

Tracing route to 11.1.0.1 over a maximum of 30 hops

  1     2 ms     1 ms     1 ms  192.168.1.1 
  2     *        *        *     Request timed out.
  3     *        *        *     Request timed out.
  4     *        *        *     Request timed out.
  5     *        *        *     Request timed out.
  6     *        *        *     Request timed out.
  7     *        *        *     Request timed out.
  8     *        *        *     Request timed out.
  
 */

