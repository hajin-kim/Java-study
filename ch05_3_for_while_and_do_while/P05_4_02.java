/**
 * 
 */
package ch05_3_for_while_and_do_while;

/**
 * @author kimhajin
 *
 */
public class P05_4_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;
		
		while(i < 100)
			System.out.println(++i + ".");
		do
			System.out.println(i-- + ".");
		while(i > 0);
	}

}
