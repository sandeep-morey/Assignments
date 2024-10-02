package assignments;

import java.util.Scanner;

/**
 * "Assignment 11 Print 10 to 1 using For Loop"
 */
public class Assignment_11 {

	public void forloop() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Could you please Enter 1 to print the 1 to 10 numbers");

		sc.nextInt();

		System.out.println("Here you can go........");

		for (int i = 10; i >= 1; i--) {
			System.out.println(i);

		}
		sc.close();
	}

	public static void main(String[] args) {
		System.out.println("main method");
		Assignment_11 ob = new Assignment_11();
		ob.forloop();

	}
}
