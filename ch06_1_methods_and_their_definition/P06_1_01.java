/**
 * 
 */
package ch06_1_methods_and_their_definition;

/**
 * @author kimhajin
 *
 */
public class P06_1_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		division(10, 3);

	}

	static void division(int a, int b) {
		System.out.println("Quotient: " + a / b);
		System.out.println("Remainder: " + a % b);
	}
}
