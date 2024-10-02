/**
 * 
 */
package assignments;

/**
 * 
 * " WAP on Parameterised super calling statement (within multiple class)"
 */
public class Assignment_18_ParamaterizedSupercallingStatments 
{

	Assignment_18_ParamaterizedSupercallingStatments(int a, int b) {
		int sum = a + b;
		System.out.println("The addition of two number is :-" + sum);
	}
}

class Secondclass extends Assignment_18_ParamaterizedSupercallingStatments {
	Secondclass(int x, int y) {
		super(1, 2);
		int result = x - y;
		System.out.println("The substraction of 2 Number is :-" + result);
	}
}

class Third extends Secondclass {
	public Third(int d, int e) {
		super(5, 5);
		int result = d * e;
		System.out.println("the Multiplication of Two number is" + result);

	}
}

class Four extends Third {
	Four(double a, double b) {
		super(10, 9);
		double result = a / b;
		System.out.println("The division of Two number is " + result);

	}

	public static void main(String[] args) 
	{
		System.out.println("Main method of the program");
		Four obj = new Four(5.0, 5.0);
		
	}
}