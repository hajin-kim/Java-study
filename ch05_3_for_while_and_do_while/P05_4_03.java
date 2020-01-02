/**
 * 
 */
package ch05_3_for_while_and_do_while;

/**
 * @author kimhajin
 *
 */
public class P05_4_03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		int i = 0;
		
		while(i++ < 1000)
			if(i % 2 == 0 && i % 7 == 0) {
				System.out.println(i);
				sum += i;
			}
		
		System.out.println("Sum: " + sum);
	}

}
