package assignments;

public class Assignment_3 {
	// Assignment 3 Operators with static method by using method overloading
	// concepts..

	public static void methodadd() {
		int x = 10;
		int y = 20;
		int sum = x + y;
		System.out.println("Static method addition of 2 number is----------->" + sum);
	}

	public static void methodadd(int a, int b) {
		int c = a - b;
		System.out.println("static method overloding with different argument----->" + c);
	}

	public static void methodadd(int a, double b) {
		double c = a * b;
		System.out.println("Double value is----->" + c);

	}

	public static void methodadd(int a, int b, double c, String s) {
		int sum = a / b;
		System.out.println("The division of method overloading--->" + sum);
		System.out.println(c);
		System.out.println(s);
	}

	public static void main(String[] args) {
		System.out.println("Main method program execution starts from here");
		// Static method can be call by using class name.

		Assignment_3.methodadd();

		// static methods can be call by using directly by using method name
		methodadd(10, 20);
		methodadd(12, 20.00);
		methodadd(10, 2, 20.00, "sandeep");

	}

}
