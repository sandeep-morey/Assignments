/**
 * 
 */
package assignments;

import javapractice.MethodOverriding.childclass;

/**
 * "Assignment 14 Single level inheritance by using Static methods"
 */
public class Assignment_14_Parentclass {

	public static void addition() {
		System.out.println("Single level inhertence");
		int x = 100;
		int y = 200;
		int sum = x + y;
		System.out.println("The sum of Two number is:-" + sum);

	}

	public static void substraction() {
		System.out.println("2nd method");
		int a = 100;
		int b = 200;
		int result = b - a;
		System.out.println("The substraction of two number is:-" + result);
	}

	public static void multiplication() {
		System.out.println("3rd method");
		int a = 10;
		int b = 20;
		int c = a * b;
		System.out.println("The Multiplication of Two number is:-" + c);
	}

	class Child extends Assignment_14_Parentclass {
		public static void division() {
			int x = 100;
			int y = 200;
			int z = x / y;
			System.out.println("The division of two number is:-" + z);
		}
	}
	

	public static void main(String args[]) {
		System.out.println("Main Method");
		
		//Calling static methods by using directly class name.
		Child.addition();
		Child.substraction();
		Child.multiplication();
		Child.division();
		

	}
}

