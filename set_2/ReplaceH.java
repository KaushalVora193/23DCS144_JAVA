import java.util.Scanner;
public class ReplaceH {
    public static void main(String[] args) 
    {
        String str = "CHARUSAT UNIVERSITY";

        int length = str.length();
        System.out.println("Length of the string: " + length);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your First Name : ");
        String name = sc.next();
        char first = name.charAt(0);

        String replacedStr = name.replace(first, 'H');
        System.out.println("String after replacing First Letter with 'H': " + replacedStr);

        String lowerCaseStr = str.toLowerCase();
        System.out.println("String in lowercase: " + lowerCaseStr);
    }
}