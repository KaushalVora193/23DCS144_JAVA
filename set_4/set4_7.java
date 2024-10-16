import Circle;
import Rectangle;
import Shape;
import Sign;

package set_4;
interface Shape { void print(); }

class Circle implements Shape {
    int radius;
    String color;
    Circle(int radius, String color) 
    {
        this.radius = radius;
        this.color = color;
    }

    public void print() 
    {
        System.out.println("\n Radius : " + radius + "\n Color : " + color);
    }
}

class Rectangle implements Shape 
{
    int length;
    int width;
    String color;

    Rectangle(int length, int width, String color) 
    {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public void print() 
    {
        System.out.println("\n Length : " + length + "\n Width : " + width + "\n Color : " + color);
    }
}

class Sign 
{
    Shape s;
    String text;

    Sign(Shape s, String text) 
    {
        this.s = s;
        this.text = text;
    }

    void print() 
    {
        s.print();
        System.out.println("Text : " + text);
    }
}
public class set4_7
{ 
    public static void main(String[] args) 
    {
        Circle c = new Circle(10, "Red");
        Rectangle r = new Rectangle(10, 20, "Blue");
        Sign s = new Sign(c, " This is Circle");
        
        s.print();
        Sign s1 = new Sign(r, " This is Rectangle");
        s1.print();
    }
}
