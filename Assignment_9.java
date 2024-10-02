/**
 * 
 */
package assignments;

import java.util.Scanner;

/**
 * "Assignment 9 Find Area of Rectangle using Scanner class"
 */
public class Assignment_9 {

	public static void main(String[] args) {

		System.out.println("The main method program execution");
		Assignment_9 obj = new Assignment_9();
		obj.findingareaofrectangle();

	}

	public void findingareaofrectangle() {
		int length;
		int breadth;
		int area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the Rectangle----->");
		length = sc.nextInt();
		System.out.println("Enter the Breadth of the Rectangle------>");
		breadth = sc.nextInt();
		area = length * breadth;
		System.out.println("The area of Rectnagle is:-" + area);

	}

}
