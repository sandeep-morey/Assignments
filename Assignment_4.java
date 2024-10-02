package assignments;

public class Assignment_4 {
	// Assignment 4 Operators with Non Static method by using method overloading
	// concepts

	void run() {
		System.out.println("Instance mthod implementation.");
		int x = 10;
		int y = 20;
		int c;
		c = x + y;
		System.out.println("The addition of two number is-------------->" + c);
	}

	int run(int a, int b) {
		int results;
		results = a * b;
		System.out.println("Multiplication of two number is ==============>" + results);
		return results;
	}

	void run(double b, float f) {
		double div = b / f;
		System.out.println("The division of two number is ==============>" + div);
	}

	void run(int m, int f, String str) {
		int total = m - f;
		System.out.println("The toatl 3 count is " + str);
	}

	public static void main(String[] args) {
		System.out.println("Calling global variables and global method by creating objects");
		Assignment_4 obj = new Assignment_4();
		obj.run();
		obj.run(20, 30);
		obj.run(10, 20);
		obj.run();

	}
}
