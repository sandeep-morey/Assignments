/**
 * 
 */
package assignments;

import java.util.Scanner;

/**
 * "Assignment 13 WAP on thread class (thread.sleep)"
 */
public class Assignments13 {

	public void thread() throws InterruptedException {
		int a = 10;
		int b = 20;
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of A");
		s1.nextInt();
		System.out.println("Enter the value of B");
		s1.nextInt();
		int result = a + b;
		System.out.println("The sum of A and B is :-" + result);

		// Thread . sleep implementation logic.

		for (int obj = 0; obj <= 10; obj++) {
			System.out.println(obj);
			Thread.sleep(1000);

			for (int i = 0; i <= 5; i++) {
				System.out.println(i);
				Thread.sleep(2000);
			}
		}

	}

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main Method program");
		Assignments13 obj = new Assignments13();
		obj.thread();

	}
}
