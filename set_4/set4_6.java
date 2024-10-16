package set_4;
import java.util.*;

interface AdvancedArithmetic { int divisor_sum(int n); }

class calledMyCalculator implements AdvancedArithmetic
{
    public int  divisor_sum(int n)
    {
        int sum = 0;

        for(int i = 1; i<= n; i++)
        { if(n % i == 0) { sum += i; } }
        return sum;
    }
}
public class set4_6 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        calledMyCalculator s = new calledMyCalculator();
        System.out.print(" Enter The Number : ");
        int n = sc.nextInt();
        System.out.println(" The sum of the Divisors of the number is : " + s.divisor_sum(n));
    }
}
