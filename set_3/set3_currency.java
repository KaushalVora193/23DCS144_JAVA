public class set3_currency {
    public static void main(String[] args) 
    {
        double amountInPounds = Double.parseDouble(args[0]);
        double amountInRupees = convertPoundsToRupees(amountInPounds);
        System.out.println(amountInPounds+" Pounds is equal to "+amountInRupees+" Rupees");
    }

    public static double convertPoundsToRupees(double amount) {
        return amount * 100;
    }}
       