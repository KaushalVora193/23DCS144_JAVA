package set_2;
public class set2DoubleChar
{
    public static String DoublecHar(String input)
    {
        String output = "";
        for (int i = 0; i < input.length(); i++) { output += input.charAt(i); output += input.charAt(i); }
        return output;
    }
    public static void main(String[] args)
    {
        String s = "welcome";
        String output = DoublecHar(s);
        System.out.println(output);
    }
}