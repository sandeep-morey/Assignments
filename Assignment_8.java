/**
 * 
 */
package assignments;

import java.util.Scanner;

/**
 * "Assignment 8 ======> Find Area of Square using Scanner class"
 * 
 */
public class Assignment_8 {
	public static void AreaofSquare() {
		int length;
		int area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Length of the Square=========>");
		length = sc.nextInt();
		System.out.println("The length of the square is=======>" + length);
		area = length * length;
		System.out.println("The area of the Square is=====>" + area);
		sc.close();

	}

	public static void main(String[] args) {
		System.out.println("Finding the Area of Square using Scanner Class");

		Assignment_8.AreaofSquare();

	}

}
