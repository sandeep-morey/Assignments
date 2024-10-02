package assignments;

public class Assignment_17_nonParameterizedsuperCallingStatment {
	// Constructor for the parent class
	Assignment_17_nonParameterizedsuperCallingStatment() {
		int a = 10;
		int b = 20;
		int sum = a + b;
		System.out.println("The Sum of 2 numbers is: " + sum);
	}
}

class Frist_Child extends Assignment_17_nonParameterizedsuperCallingStatment {
	// Constructor for Childclass_1
	Frist_Child() {
		int x = 10;
		int y = 5;
		int result = x - y;
		System.out.println("The subtraction of two numbers is: " + result);
	}
}

class Second_Child  extends Frist_Child{
	// Constructor for Childclass_2
	Second_Child() {
		int x = 10;
		int y = 5;
		int result = x * y;
		System.out.println("Multiplication of two numbers is: " + result);
	}
}

class Third_Child extends Second_Child {
	// Constructor for Childclass_3
	public Third_Child() {
		int a = 10;
		int b = 5;
		int result = a / b;
		System.out.println("The division of two numbers is: " + result);
	}

		public static void main(String[] args) 
		{
			// Instantiate Childclass_3 to trigger the constructors
			
			Third_Child obj = new Third_Child();
			
			
		}
	}

