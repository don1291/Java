class SimpleThread extends Thread {
    public SimpleThread(String str) {
        super(str);
    }
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + getName());
            try {
                sleep(100);
            } catch (InterruptedException e) {}
        }
        System.out.println("DONE! " + getName());
    }
}


public class ThreadsTest {
    public static void main (String[] args) {
        new SimpleThread("Jamaica").start();
        new SimpleThread("Fiji").start();
		new SimpleThread("Bermuda").start();
		new SimpleThread("Bora Bora").start();
		new SimpleThread("Dubai").start();
		new SimpleThread("Doha").start();

	}
}
	