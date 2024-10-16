package set_4;
import java.util.Scanner;

import Employee;
import Manager;
import Member;

class Member {

    String name, address;
    int age, salary;
    int pn;

    Scanner sc = new Scanner(System.in);

    public void getinfo() {

        System.out.print(" Enter Name : ");
        name = sc.nextLine();
        System.out.print(" Enter Age : ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print(" Enter Phone Number : ");
        pn = sc.nextInt();
        sc.nextLine();
        System.out.print(" Enter Address : ");
        address = sc.nextLine(); 
        System.out.print(" Enter salary : ");
        salary = sc.nextInt();
    }

    public void printSalary() {
        System.out.println(" Salary         : " + salary);
    }

    public  void print() {
        System.out.println(" Name           : " + name);
        System.out.println(" Age            : " + age);
        System.out.println(" Phone Number   : " + pn);
        System.out.println(" Address        : " + address);
        printSalary();
    }
}

class Employee extends Member {

    String specialization;
    Scanner sc = new Scanner(System.in);
    public void getemp() {
        System.out.println("=====EMPLOYEE=====");
        getinfo();
        System.out.print(" Enter Specialization : ");
        specialization = sc.nextLine(); 
    }

    public void printemp(){
        System.out.println("=====EMPLOYEE=====");
        print();
        System.out.println(" Specialization : "+specialization);
        System.out.println();
    }
}

class Manager extends Member {
    
    String depart;
    
    public void getmanager() {
        System.out.println("=====MANAGER=====");
        getinfo();
        sc.nextLine();
        System.out.print(" Enter Department : ");
        depart = sc.nextLine();
    }
    public void printmanager(){
        System.out.println("=====MANAGER=====");
        print();
        System.out.println(" Department     : "+depart);
    }
}

public class set4_2 {

    public static void main(String[] args) {
        Manager m=new Manager();
        Employee e=new Employee();
        e.getinfo();
        e.printemp();
        m.getmanager();
        m.printmanager();
    }
}
