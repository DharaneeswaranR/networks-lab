public class TestDaemonThread extends Thread{
    TestDaemonThread(String name) {
        super(name);
    }

    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println(getName() + " is a daemon thread");
        } else {
            System.out.println(getName() + " is a user thread");
        }
    }

    public static void main(String[] args) {
        TestDaemonThread t1 = new TestDaemonThread("t1");
        TestDaemonThread t2 = new TestDaemonThread("t2");
        TestDaemonThread t3 = new TestDaemonThread("t3");

        t1.setDaemon(true);

        t1.start();
        t2.start();
        t3.start();
    }
}


/* Output

t2 is a user thread
t1 is a daemon thread
t3 is a user thread

*/
