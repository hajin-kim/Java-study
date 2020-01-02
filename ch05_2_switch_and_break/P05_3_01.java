/**
 * 
 */
package ch05_2_switch_and_break;

/**
 * @author kimhajin
 *
 */
public class P05_3_01 {

	public static void main(String args[]) {
		int n = 24;
		
		switch(n / 10) {
		case 0:
			System.out.println("Less than 10");
			break;
		case 1:
			System.out.println("Less than 20");
			break;
		case 2:
			System.out.println("Less than 30");
			break;
		default:
			System.out.println("Negative or big");
		}
	}

}
