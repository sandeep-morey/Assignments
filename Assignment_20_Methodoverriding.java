/**
 * 
 */
package assignments;

/**
 * "WAP on Method Overriding"
 */
class Assignment_20_Methodoverriding {

	public int speedofvechicle() {

		return 50;
	}
}

class Car extends Assignment_20_Methodoverriding {
	public int speedofvechicle() {
		return 100;

	}

}

class Bike extends Assignment_20_Methodoverriding {
	public int speedofvechicle() {
		return 150;

	}

	public class Mainmethodexecution {
		public static void main(String[] args) {

			Assignment_20_Methodoverriding obj = new Assignment_20_Methodoverriding();
			System.out.println("The speed of the vechile is " + obj.speedofvechicle());

			Assignment_20_Methodoverriding obj1 = new Car();
			System.out.println("The speed of the car is " + obj1.speedofvechicle());

			Assignment_20_Methodoverriding obj2 = new Bike();
			System.out.println("The speed of the Bike is " + obj2.speedofvechicle());

		}
	}
}
