package set_7;
import java.util.LinkedList;

class Buffer {
    LinkedList<Integer> buffer = new LinkedList<>();
    int bufferSize;

    public Buffer(int size) {bufferSize = size;}

    public synchronized void produce(int item) throws InterruptedException {
        while (buffer.size() >= bufferSize) {
            System.out.println("Buffer full, producer is waiting.");
            wait();
        }
        buffer.add(item);
        System.out.println(" Produced : " + item + ", Buffer : " + buffer);
        notify(); 
    }

    public synchronized int consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            System.out.println(" Buffer empty, Consumer is Waiting.");
            wait(); 
        }
        int item = buffer.removeFirst();
        System.out.println(" Consumed : " + item + ", Buffer : " + buffer);
        notify(); 
        return item;
    }
}

class Producer extends Thread {
    Buffer buffer;

    public Producer(Buffer buffer) {this.buffer = buffer;}

    @Override
    public void run() {
        try {
            while (true) {
                int item = (int) (Math.random() * 100); 
                buffer.produce(item);
                Thread.sleep((long) (Math.random() * 1000)); 
            }
        } 
        catch (InterruptedException e) {Thread.currentThread().interrupt();}
    }
}

class Consumer extends Thread {
    Buffer buffer;

    public Consumer(Buffer buffer) {this.buffer = buffer;}

    @Override
    public void run() {
        try {
            while (true) {
                buffer.consume();
                Thread.sleep((long) (Math.random() * 1000)); 
            }
        } 
        catch (InterruptedException e) {Thread.currentThread().interrupt();}
    }
}

public class set7_6 {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(5);
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
    }
}
