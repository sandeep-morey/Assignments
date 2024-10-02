/**
 * 
 */
package assignments;

/**
 * " WAP on parameterized and non-parameterized this calling statement in java"
 */
public class Assignment_19_parameterizednon_parameterized_thiscalling_statment {
	Assignment_19_parameterizednon_parameterized_thiscalling_statment() {

		System.out.println("Default constructer with 0 Argument");
		int x = 10;
		int y = 20;
		int z = x + y;
		System.out.println(z);
	}

	Assignment_19_parameterizednon_parameterized_thiscalling_statment(int a, int b) {
		this();
		System.out.println("Parameterized Constructer");
		int sum = a - b;
		System.out.println("The subtraction of 2 number is :-" + sum);
	}

	Assignment_19_parameterizednon_parameterized_thiscalling_statment(double a, int b) {
		this(10, 10);
		System.out.println("Parameterized constructer with different data types");
		double Mul = a * b;
		System.out.println("The division of two number is " + Mul);
	}

	Assignment_19_parameterizednon_parameterized_thiscalling_statment(int x, int y, int z) {
		this(10.0, 10);
		System.out.println("Three argument constructer");
		int addition = x + y + z;
		System.out.println("The result of 3 number is " + addition);

	}

	Assignment_19_parameterizednon_parameterized_thiscalling_statment(double a, double b) {
		this(10, 20, 5);
		System.out.println("The double value constructer");
		double division = a / b;
		System.out.println("The division of Two number is " + division);
	}

	public static void main(String[] args) {

		System.out.println("The main method program execution");

		// Object creation by using class name without this() calling statments
//	Assignment_19_parameterizednon_parameterized_thiscalling_statment obj = new Assignment_19_parameterizednon_parameterized_thiscalling_statment();
//	new Assignment_19_parameterizednon_parameterized_thiscalling_statment(10,5);
//	new Assignment_19_parameterizednon_parameterized_thiscalling_statment(5,5);
//	new Assignment_19_parameterizednon_parameterized_thiscalling_statment(10,20,5);

		// if we use this () statment no need to create multiple objects

		Assignment_19_parameterizednon_parameterized_thiscalling_statment ob = new Assignment_19_parameterizednon_parameterized_thiscalling_statment(
				10.9, 5.9);

	}
}