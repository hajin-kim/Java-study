/**
 * 
 */
package ch05_5_multiple_loops;

/**
 * @author kimhajin
 *
 */
public class P05_7_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 2; i <= 8; i += 2) {
			for (int j = 1; j <= i; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println();
		}
	}

}
