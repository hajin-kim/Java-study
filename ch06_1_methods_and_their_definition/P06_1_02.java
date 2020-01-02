/**
 * 
 */
package ch06_1_methods_and_their_definition;

/**
 * @author kimhajin
 *
 */
public class P06_1_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		difference(10, 5);
		difference(-3, -2);
	}
	
	static void difference(int a, int b) {
		System.out.println("Difference: " + (a>b?a-b:b-a));
	}

}
