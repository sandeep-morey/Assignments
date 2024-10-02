/**
 * 
 */
package assignments;

import java.util.Scanner;

/**
 * Find circumference of circle using Scanner class"
 */
public class Assignment_6 {
	void Circumference() {
		System.out.println("Finding the circumference of the circle");
		int r;
		double circumstance;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of R--Radious of circle");
		r = sc.nextInt();
		circumstance = Math.PI * 2 * r;
		System.out.println("Circumference of the Circle is ----> " + circumstance);
		sc.close();
	}

	public static void main(String args[]) {
		System.out.println("Main method execution");
		Assignment_6 obj = new Assignment_6();
		obj.Circumference();

	}

}