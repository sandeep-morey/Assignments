/**
 * 
 */
package assignments;

import java.util.Scanner;

/**
 * "Assignment 5 Find Area of Circle using Scanner class"
 */
public class Assignment_5 {

	public void AreaofaCircle() {
		System.out.println("Finding the area of a circle");
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of PI");
		int result = s1.nextInt();
		double pi = 3.14;
		int r = 3;
		double area = pi * r * r;
		System.out.println("The area of circle is==========>" + area);
		s1.close();

	}

	public static void main(String args[]) {
		System.out.println("Main method");
		Assignment_5 aa = new Assignment_5();
		aa.AreaofaCircle();

	}
}
