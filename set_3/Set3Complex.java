package set_3;
import java.util.Scanner;

class Set3Complex
{

	double real , img ;

	Set3Complex() { real = 0 ; img = 0; }
	Set3Complex(double a , double b) { real = a ; img = b; }

	public Set3Complex addComplex(Set3Complex obj)
	{
		Set3Complex obj1 = new Set3Complex();
		obj1.real = real+ obj.real;
		obj1.img = img+obj.img;
		return 	obj1;
	}

	public Set3Complex substractComplex(Set3Complex obj)
	{
		Set3Complex obj1 = new Set3Complex();
		obj1.real = real - obj.real;
		obj1.img = img - obj.img;
		return 	obj1;
	}

	public Set3Complex multiplyComplex(Set3Complex obj)
	{
		Set3Complex obj1 = new Set3Complex();
		obj1.real = (real*obj.real) - (img*obj.img);
		obj1.img = (real*obj.img) + (img*obj.real);
		return 	obj1;
	}

	public Set3Complex divideComplex(Set3Complex obj)
	{
		Set3Complex obj1 = new Set3Complex();
		if(obj.real == 0 && obj.img == 0) {obj1.real = 0 ; obj1.img = 0;  }
		else
		{
		obj1.real = ((real*obj.real) + (img*obj.img))/((obj.real*obj.real) + (obj.img*obj.img));
		obj1.img = ((img*obj.real)-(real*obj.img))/((obj.real*obj.real) + (obj.img*obj.img));
		}
		return 	obj1;
	}


	public void display()
	{
		if(img>=0){ System.out.println(" "+real+" + "+img+"i");}
		else{ System.out.println(" "+real+" - "+(img*(-1))+"i");}
	}


	public static void main(String[] args)
	{
		Set3Complex c1 = new Set3Complex(1,5);
		Set3Complex c2 = new Set3Complex(3,-8);

		Set3Complex add = new Set3Complex();
		Set3Complex sub = new Set3Complex();
		Set3Complex mul = new Set3Complex();
		Set3Complex div = new Set3Complex();


		add = c1.addComplex(c2);
		sub = c1.substractComplex(c2);
		mul = c1.multiplyComplex(c2);
		div = c1.divideComplex(c2);


		System.out.print(" Addition       : ");
		add.display();

		System.out.print(" Substraction   : ");
		sub.display();

		System.out.print(" Multiplication : ");
		mul.display();

		if(c2.real == 0 && c2.img == 0 ) { System.out.println(" Warning : Divide By 0 Error!! "); }
		else { System.out.print(" Division       : "); div.display(); }
	}	
}


	 