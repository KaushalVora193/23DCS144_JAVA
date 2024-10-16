import java.util.Scanner;
import java.util.ArrayList;
import java.util.Stack;
class StAck
{
    static ArrayList<Integer> stack = new ArrayList<Integer>(10);

    public boolean isemptY(){ return stack.isEmpty();}

    public static void push(Integer elem){ stack.add(elem); }

    public static Integer pop()
    {
        if (stack.isEmpty()){System.out.println(" Stack Empty!!"); return -1;}
        return stack.removeLast(); 
    }

    public static int getsize(){ return stack.size(); }

    public static int peek(){ return stack.get(getsize()-1);}

    public static void display()
    {
        if(!stack.isEmpty())
        {
            System.out.println(" Size of Stack : "+getsize());
            System.out.println(" Peek Element  : "+peek());
            System.out.print(" Stack : ");
            for (int i = 0; i < stack.size(); i++)
            { System.out.print(stack.get(i)+ " "); }
            System.out.println();
        }
        else{ System.out.println(" Stack Empty!! "); }
    }
}
public class set8_1 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        OUTER:
        while (true) 
        { 
            System.out.print("\n 1) Push  \n"+ 
                             " 2) Pop     \n"+
                             " 3) Dispaly \n"+
                             " 4) Exit.   \n"+
                             " Enter Your Choice : ");

            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                        System.out.print(" Enter Element to be Inserted : ");
                        int elem = sc.nextInt();
                        StAck.push(elem);
                        break;

                case 2:
                        int poP = StAck.pop();
                        if(poP != -1){System.out.println(" Popped Element is : "+poP);}
                        break;

                case 3:
                        StAck.display();
                        break;

                case 4:
                        System.out.println(" Exit!!");
                        break OUTER;

                default:
                        System.out.println(" Invalid Choice!!");
                        break;
            }
        }
    }
}
