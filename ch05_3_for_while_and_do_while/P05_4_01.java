/**
 * 
 */
package ch05_3_for_while_and_do_while;

/**
 * @author kimhajin
 *
 */
public class P05_4_01 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		while(i < 100) {
			sum += i++;
		}
		
		System.out.println(sum);
	}
}
