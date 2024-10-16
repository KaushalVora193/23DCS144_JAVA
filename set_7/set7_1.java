class HelloWorldThread extends Thread {
    public void run() {System.out.println("Hello World from Thread!");}
}

class HelloWorldRunnable implements Runnable {
    public void run() {System.out.println("Hello World from Runnable!");}
}

public class set7_1 {
    public static void main(String[] args) {
        // A. Using the extended Thread class
        HelloWorldThread thread1 = new HelloWorldThread();
        thread1.start();

        // B. Using the Runnable interface
        Thread thread2 = new Thread(new HelloWorldRunnable());
        thread2.start();
    }
}
