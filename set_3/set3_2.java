import set_4.Employee;

package set_3;
public class set3_2 
{
    public static void main(String[] args) {
        Employee emp1 = new Employee("John", "Doe", 3000);
        Employee emp2 = new Employee("Jane", "Smith", 4000);

        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + "'s yearly salary: $" + emp1.getYearlySalary());
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + "'s yearly salary: $" + emp2.getYearlySalary());

        emp1.giveRaise(10);
        emp2.giveRaise(10);

        System.out.println("\nAfter 10% raise:");
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + "'s yearly salary: " + emp1.getYearlySalary()+" $");
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + "'s yearly salary: " + emp2.getYearlySalary()+" $");
    }
}
    class Employee 
    {
        String firstName;
        String lastName;
        double monthlySalary;

        public Employee(String firstName, String lastName, double monthlySalary) {
            this.firstName = firstName;
            this.lastName = lastName;
        
            if (monthlySalary > 0.0) { this.monthlySalary = monthlySalary; } 
            else { this.monthlySalary = 0.0; }
        }

        public String getFirstName() { return firstName; }

        public void setFirstName(String firstName) { this.firstName = firstName; }

        public String getLastName() { return lastName; }

        public void setLastName(String lastName) { this.lastName = lastName; }

        public double getMonthlySalary() { return monthlySalary; }

        public void setMonthlySalary(double monthlySalary) {
            if (monthlySalary > 0.0) { this.monthlySalary = monthlySalary; } 
            else { this.monthlySalary = 0.0; }
        }

        public double getYearlySalary() { return monthlySalary * 12; }

        public void giveRaise(double percentage) 
        {
            this.monthlySalary += this.monthlySalary * (percentage / 100);
        }
    }


