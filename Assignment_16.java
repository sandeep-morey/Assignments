/**
 * 
 */
package assignments;

/**
 * Multi level inheritance by using static and Non Static methods by using 4
 * classes"
 */
public class Assignment_16 {
	public int add(int a, int b) {
		System.out.println("Multilevel inheritence");
		int result = a + b;
		System.out.println("The addition of two number is :-" + result);
		return result;
	}
}

class Childclass_1 extends Assignment_16 {
	public double sub(double x, double y) {
		double result = x - y;
		System.out.println("The substraction of two number is:-" + result);
		return result;
	}

}

class Childclass_2 extends Childclass_1 {
	public static int mul(int m, int n) {
		int sum = m * n;
		System.out.println("Static method's, Multiplication of two number is:-" + sum);
		return sum;
	}
}

class Childclass_3 extends Childclass_2 {
	public static double division(double a, double b) {
		double result = a / b;
		System.out.println("Static Method, The Division of Two number is:-" + result);
		return result;
	}
}

class Childclass_4 extends Childclass_3 {
	public String stringmethod(String a) {
		String result = "SandeepkumarM";
		System.out.println("The string name is:-" + result);
		return result;
	}

	public static void main(String args[]) {
		System.out.println("Main method of the program starts executing from here child class_4");

		Childclass_4 obj = new Childclass_4();
		obj.stringmethod(null);
		obj.add(10, 20);
		obj.sub(10.5, 5.5);

		// accessing static methods

		Childclass_2.mul(10, 10);
		Childclass_3.division(10, 5);

	}

}
