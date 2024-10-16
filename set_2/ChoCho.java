public class ChoCho 
{
    public static void front_times(String a , int time)
    {
        int n = 4;
        for(int i = 1 ; i<=time ; i++)
        {
            if(a.length()<n){System.out.println(" Entered String is Small!! "); break;}
            else{String sub = a.substring(0,n);System.out.print(sub);}
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
        String Example = "Hitarth";
        int t = 4 ; 
        front_times("Chocolate",2);
        front_times("Chocolate", 3);
        front_times(Example,t);
    }
}
