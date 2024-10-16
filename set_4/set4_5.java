package set_4;
import java.util.*;

public class set4_5 
{
    void getdegree()
    {
        System.out.println("I got a degree");
    }  
         
    public static void main(String[]args)
        {
            set4_5 obj=new set4_5 ();
            obj.getdegree();
            Undergraduate obj1=new Undergraduate();
            obj1.getdegree();
            Postgraduate obj2 =new Postgraduate();
            obj2.getdegree();
         }
}

class Undergraduate extends set4_5 
{
    void getdegree()
    {
        System.out.println("I am an Undergraduate");
    }
}

class Postgraduate extends set4_5 
{
    void getdegree()
    {
        System.out.println("I am a Postgraduate");
    }
}
