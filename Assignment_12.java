/**
 * 
 */
package assignments;

import java.util.Scanner;

import javapractice.Mathclass;

/**
 * "Assignment 12 Area of Circle using Math class"
 */
public class Assignment_12 {
	public void mathclass_method() {
		System.out.println("Math class method implementation");
		int r;
		double area;
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter the value of radius");
		r = s1.nextInt();
		area = Math.PI * r * r;
		System.out.println("The area of Circle is:-" + area);
		s1.close();
	}
	public static void main(String[] args) {

		System.out.println("Main method execution");
		Assignment_12 mm = new Assignment_12();
		mm.mathclass_method();

	}
}