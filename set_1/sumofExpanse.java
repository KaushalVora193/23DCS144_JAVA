import java.util.Scanner;
public class sumofExpanse 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Enter Number of Days : ");
        int days = sc.nextInt();

        System.out.print("\n Enter Daily Expanses for "+days+" Days : ");

        int[] Expanse = new int[days];
        int total=0;

        for(int i = 0 ; i<days ; i++)
        {
            Expanse[i] = sc.nextInt();
            total+= Expanse[i];
        }

        System.out.println("\n Total Expanse of "+days+" Days is : "+total);
    }
}
