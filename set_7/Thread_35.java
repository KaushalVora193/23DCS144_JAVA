package set_7;
class IncrementValueByThread implements Runnable {
    int value = 0;

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                value++; 
                System.out.println("Value: " + value);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted.");
        }
    }
}

public class Thread_35{
    public static void main(String[] args) {
        IncrementValueByThread incrementer = new IncrementValueByThread();
        Thread thread = new Thread(incrementer);
        thread.start();
    }
}

