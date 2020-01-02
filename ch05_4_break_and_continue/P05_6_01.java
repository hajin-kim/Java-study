/**
 * 
 */
package ch05_4_break_and_continue;

/**
 * @author kimhajin
 *
 */
public class P05_6_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 5 != 0 || i % 7 != 0) {
				continue;
				
			}
			++count;
			System.out.println(i);
		}
		System.out.println("Times of running: " + count);
	}

}
