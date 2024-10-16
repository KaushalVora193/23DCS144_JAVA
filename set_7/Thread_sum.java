package set_7;
import java.util.Scanner;

class SumThread extends Thread {
    int start;
    int end;
    int sum;

    public SumThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        sum = 0;
        for (int i = start; i <= end; i++) {sum += i;}
    }

    public int getSum() {return sum;}
}

public class Thread_sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int N = scanner.nextInt();

        System.out.print("Enter the number of threads : ");
        int numberOfThreads = scanner.nextInt();

        int range = N / numberOfThreads;
        SumThread[] threads = new SumThread[numberOfThreads];

        for (int i = 0; i < numberOfThreads; i++) {
            int start = i * range + 1;
            int end = (i == numberOfThreads - 1) ? N : (i + 1) * range;
            threads[i] = new SumThread(start, end);
            threads[i].start();
        }

        int totalSum = 0;
        try {
            for (SumThread thread : threads) {
                thread.join(); 
                totalSum += thread.getSum(); 
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }

        System.out.println("The sum of the first " + N + " numbers is: " + totalSum);
        scanner.close();
    }
}
