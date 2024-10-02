/**
 * 
 */
package assignments;

/**
 * WAP on Method Overriding using super keyword in java
 */
class Assignment_21_Method_Overriding_superkeyword {

	public int add() {
		int a = 10;
		int b = 20;
		int sum = a + b;
		System.out.println("the addition method");
		System.out.println("The addiition of two number is " + sum);
		// return 10;
		return sum;
	}
}

class Chilclass extends Assignment_21_Method_Overriding_superkeyword {
	public int add() {
		super.add();
		System.out.println("Child class method");
		return 0;
	}

	public class Mainmethodclass {
		public static void main(String[] args) {
			Chilclass obj = new Chilclass();
			obj.add();

		}
	}
}
