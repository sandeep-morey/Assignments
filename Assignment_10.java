/**
 * 
 */
package assignments;

import java.util.Scanner;

/**
 * "Assignment 10 Print 1 to 10 using For Loop"
 */
public class Assignment_10 {

	public void forloop() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Could you please Enter 1 to print the 1 to 10 numbers");
		sc.nextInt();
		System.out.println("Here you can go........");
		
		for(int obj=1; obj<=10;obj++)
		{
			System.out.println(obj);
		}
		sc.close();
	}

public static void main(String[] args) 
{

	Assignment_10 ob = new Assignment_10();
	ob.forloop();
	
}
}
