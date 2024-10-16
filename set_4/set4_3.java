package set_4;
import java.util.*;

public class set4_3
{

  int length;
  int breadth;

set4_3(int length,int breadth)
      {
this.length=length;
this.breadth=breadth;
      }
    void perimeter()
    {

     int c=2*(length+breadth);
System.out.print("Perimeter is :"+c);
System.out.println();


    }
    void area()
    {
       int a=length*breadth;
System.out.print("area  is :"+a);
System.out.println();
    }
public static void main(String[]args)
{
set4_3 obj[]=new set4_3 [4];
obj[0]=new set4_3 (2,3);
obj[1]=new set4_3 (3,4);
obj[2]=new square(5);
obj[3]=new square(4);

for(set4_3  obj1:obj)
{
    if(obj1 instanceof square)
    {
System.out.println("square");
    }
    else
    {
System.out.println("rectangle");
    }
    obj1.perimeter();
    obj1.area();
System.out.println();
}
}
}
class square extends set4_3
{ 
    int side;
    square(int side ) { super(side, side );}
}

    

