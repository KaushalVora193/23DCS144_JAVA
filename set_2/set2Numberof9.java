package set_2;
import java.util.Scanner;
public class set2Numberof9 
{
    public static int array_count9(int[] array)
    {
        int count=0;
        for(int i=0;i<array.length;i++) { if(array[i]==9){ count++;} }
        return count;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\n Enter Number of Elemnents You Want To Add : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print(" Enter "+n+" Element : ");
        for(int i = 0 ; i<n; i++) { arr[i]=sc.nextInt(); }

        int Total9 = array_count9(arr);
        System.out.println(" Total Number of 9's in Array : "+Total9+"\n\n");
    }
}
