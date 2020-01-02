/**
 * 
 */
package ch05_4_break_and_continue;

/**
 * @author kimhajin
 *
 */
public class P05_6_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		int i = 0;
		
		while(sum <= 1000) {
			++i;
			if (i % 2 == 1) {
				sum += i;
			}
		}
		
		System.out.println("Sum: " + sum);
		System.out.println("i: " + i);
		
	}

}
