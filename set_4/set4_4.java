package set_4;
import java.util.*;
public class set4_4 {
    void shape()
    {
        System.out.println(" This is a Shape");
    }

    public static void main(String[]args)
    {
        square obj=new square();
        obj.shape();
        obj.printrectangle();
    }
}

class rectangle extends set4_4
{
   void printrectangle()
   {
        System.out.println(" This is rectangle");
   }

}

class square extends rectangle  {
    void printsquare()
    {
        System.out.println("rectangle is square");
    }
}

class circle extends set4_4
{
    void printcircle()
    {
        System.out.println("This is circle");
    }
}
