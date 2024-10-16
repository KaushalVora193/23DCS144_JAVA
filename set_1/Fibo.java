import java.util.Scanner;
public class Fibo 
{
    public static void main(String[] args) 
    {
        System.out.println();
        System.out.print(" Enter Number of days : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] fibonacci = new int[n];

        fibonacci[0] = 0; fibonacci[1] = 1;

        for(int i = 2 ; i<n; i++)fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        for(int i = 0 ; i<n; i++)System.out.print(" "+fibonacci[i]);
        System.out.println();
    }
}
