/**
 * 
 */
package assignments;

/**
 * Assignment_15-------Single level inheritance---- by using Non Static methods"
 */
class Assignment_15_Parentclass {
	public int add(int a, int b) {
		System.out.println("Non-static method");
		int result = a + b;
		System.out.println("The sum of two number is :-" + result);
		return result;
	}

	public int sub(int x, int y) {
		int result = x - y;
		System.out.println("The Substraction of two number is :-" + result);
		return result;
	}
}

class Child extends Assignment_15_Parentclass {

	public double mul(double x, double y) {
		double result = x * y;
		System.out.println("The multiplication of two number is:-" + result);
		return result;

	}

	public static void main(String[] args) {
		System.out.println("Main method of the program");
		Child bb = new Child();
		bb.add(10, 20);
		bb.sub(10, 5);
		bb.mul(20.0, 10.0);
	}
}
