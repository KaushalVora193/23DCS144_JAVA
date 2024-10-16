import java.util.Scanner;
public class Tax
{
public static void main(String[] args)
{
String[] code = {"Motor","Fan","Tube","Wire","Other"};
int[] price = {1000 , 750 , 200 , 50 , 500};
double[] tax = {1.08, 1.12 , 1.05 , 1.075 , 1.03};
int[] total_item = {0,0,0,0,0};
System.out.println();
for(int i = 0 ; i<code.length ; i++)
{
System.out.println((i+1)+") Price of "+code[i]+" : "+price[i]+" Rs.");
}
System.out.println();
int choice = 1;
Scanner sc = new Scanner(System.in);
while(choice == 1)
{
System.out.print(" Enter The Code of The Item You Want to Buy : ");
int code1 = sc.nextInt();
switch(code1)
{
case 1 :
System.out.print(" Enter the Quantity of Motor : ");
int tmotor = sc.nextInt();
total_item[code1-1]+=tmotor;
break;
case 2 :
System.out.print(" Enter the Quantity of Fan : ");
int tfan = sc.nextInt();
total_item[code1-1]+=tfan;
break;
case 3 :
System.out.print(" Enter the Quantity of Tube : ");
int ttube = sc.nextInt();
total_item[code1-1]+=ttube;
break;
case 4 :
System.out.print(" Enter the Quantity of Wire : ");
int twire = sc.nextInt();
total_item[code1-1]+=twire;
break;
case 5 :
System.out.print(" Enter the Quantity of Other Item : ");
int tother = sc.nextInt();
total_item[code1-1]+=tother;
break;
default :
System.out.println(" Wrong Input!!!");
}
System.out.print("\n Enter 1 to Continue Buying or 0 to Get Bill : ");
choice = sc.nextInt();
System.out.println();
}
double[] bill = new double[5];
for(int i = 0 ; i<bill.length ; i++)
{
    bill[i]=total_item[i]*tax[i]*price[i];
    }
    System.out.println(" ************ Bill *********** ");
    System.out.println(" Item Quantity Price");
    System.out.println(" Motor "+total_item[0]+" "+bill[0]);
    System.out.println(" Fan "+total_item[1]+" "+bill[1]);
    System.out.println(" Tube "+total_item[2]+" "+bill[2]);
    System.out.println(" Wire "+total_item[3]+" "+bill[3]);
    System.out.println(" Other "+total_item[4]+" "+bill[4]);
    System.out.println(" ------------------------------");
    System.out.println(" Total Price : "+(bill[0]+bill[1]+bill[2]+bill[3]+bill[4]));
    }}