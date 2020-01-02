/**
 * 
 */
package ch05_5_multiple_loops;

/**
 * @author kimhajin
 *
 */
public class P05_7_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 10; i++) {
target:		for (int j = 0; j < 10; j++) {
				if ((10 * i + j) + (10 * j + i) == 99) {
					System.out.println("A: " + i);
					System.out.println("B: " + j);
					break target;
				}
			}
		}
	}

}
