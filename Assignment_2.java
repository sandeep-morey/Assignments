package assignments;

public class Assignment_2 {

//Assignment-2 Operators(+,-,*,/,%) using non_static method""

	public void Addition() {
		int a = 10;
		int b = 20;
		int sum = a + b;
		System.out.println("Addition of 2 number is ---->" + sum);

	}

	public void Substraction() {
		double x = 100;
		double y = 200;
		double result = x - y;
		System.out.println("The substraction of 2 numer is ------->" + result);

	}

	void multiplication(int x, int y) {
		int z = x * y;
		System.out.println("The multiplication of 2 number is ----->" + z);
	}

	void division() {
		int x = 300;
		int y = 100;
		int div = x / y;
		System.out.println("The division of 2 number is ----------->" + div);
	}

	void modulus() {
		int p = 100;
		int q = 200;
		int result = p % q;
		System.out.println("The modulus of 2 number is---------->" + result);
	}

	public static void main(String args[]) {
		System.out.println("Main method statments");
		Assignment_2 obj = new Assignment_2();
		obj.Addition();
		obj.Substraction();
		obj.multiplication(10, 20);
		obj.division();
		obj.modulus();

	}
}
