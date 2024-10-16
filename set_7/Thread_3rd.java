package set_7;
import java.util.Random;
class ThreadGenerator extends Thread {
    Random random = new Random();
    EvenThread evenThread;
    OddThread oddThread;

    public ThreadGenerator(EvenThread evenThread, OddThread oddThread) {
        this.evenThread = evenThread;
        this.oddThread = oddThread;
    }

    @Override
    public void run() {
        for(int i = 0 ; i<10 ; i++)
        {
            int number = random.nextInt(100); 
            System.out.println("Generated number: " + number);

            if (number % 2 == 0) {
                evenThread.computeSquare(number);
            } else {
                oddThread.computeCube(number);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class EvenThread extends Thread {
    @Override
    public void run() {}
    public void computeSquare(int number) {
        int square = number * number;
        System.out.println("Square of " + number + " is: " + square+"\n");
    }
}

class OddThread extends Thread {
    @Override
    public void run() {}
    public void computeCube(int number) {
        int cube = number * number * number;
        System.out.println("Cube of " + number + " is: " + cube+"\n");
    }
}

public class Thread_3rd
{
    public static void main(String[] args) 
    {
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();
        ThreadGenerator threadGenerator = new ThreadGenerator(evenThread, oddThread);
        
        evenThread.start();
        oddThread.start();
        threadGenerator.start();
    }
}