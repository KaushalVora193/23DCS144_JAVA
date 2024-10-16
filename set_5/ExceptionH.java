package set_5;

public class ExceptionH 
{
    public static void division() throws ArithmeticException
    {
        int a = 10;
        int b= 0;
        int c = a/b;

    }

    public static void main(String[] args)
    {
        try{division();}
        catch(ArithmeticException e){System.out.println(e.getMessage());}
    }
}


