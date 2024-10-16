import java.util.Scanner;

class MeterPerSecond
{ 
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter The Distance in Meter : ");
		int distance = sc.nextInt();
		
		System.out.print(" Enter The Time (Hour Minute Second) Format : ");
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		int second = sc.nextInt();

		int total_second = (hour*3600) + (minute*60) + second ; 
		
		double mps = distance/total_second;
		double kph = mps*3.6;
		double mileph = kph/1.609;

		System.out.println(" \nSpeed in Meter per Second is : "+mps);
		System.out.println(" Speed in Kilometer per Hour : "+kph);
		System.out.println(" Speed in Mile per Hour : "+mileph);
	}
}

		
		
