/**
 * 
 */
package ch05_1_if_and_else;

/**
 * @author kimhajin
 *
 */
public class P05_2_01 {
	public static void main(String args[]) {
		int num1 = 50;
		int num2 = 100;
		int big;
		int diff;
		
		if(num1 > num2)
		{
			big = num1;
			diff = num1 - num2;
		}
		else
		{
			big = num2;
			diff = num2 - num1;
		}
		
		System.out.println("Max number: " + big);
		System.out.println("Difference: " + diff);
	
	}
}
