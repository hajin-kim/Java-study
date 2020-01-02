/**
 * 
 */
package ch06_1_methods_and_their_definition;

/**
 * @author kimhajin
 *
 */
public class P06_2_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 39;
		
		System.out.println(n + (isPrimeNumber(n)?" is prime number.":" isn't prime number"));
	}

	static boolean isPrimeNumber(int inp) {
		for (int i = 2; i < inp; i++) {
			if(inp % i == 0) return false;
		}
		return true;
	}
}
