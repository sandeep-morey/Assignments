/**
 * 
 */
package assignments;

import java.util.Scanner;

/**
 * "Assignment 7 Find Area of Triangle using Scanner class"
 */
public class Assignment_7 {
	public static void main(String args[]) {
		System.out.println("The area of Triangle main method");
		Assignment_7 obj = new Assignment_7();
		obj.AreaofTriangle();
	}

	void AreaofTriangle() {
		int height;
		int base;
		int area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height of the triangle--->");
		height = sc.nextInt();
		System.out.println("Enter the Base of the Triangle---->");
		base = sc.nextInt();
		area = height * base;
		System.out.println("The are of trangle is =================>" + area);
		sc.close();
	}
}