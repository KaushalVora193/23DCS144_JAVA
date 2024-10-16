package set_3;
import java.util.Scanner;
class Area {
    private double length;
    private double breadth;

    public Area(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double returnArea() { return length * breadth; }
}
public class set3_4 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the Rectangle  : ");
        double length = scanner.nextDouble();

        System.out.print("Enter the breadth of the Rectangle : ");
        double breadth = scanner.nextDouble();

        Area rectangle = new Area(length, breadth);

        System.out.println("The area of the Rectangle is       : " + rectangle.returnArea());
    }
}
