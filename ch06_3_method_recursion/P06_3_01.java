/**
 * 
 */
package ch06_3_method_recursion;

/**
 * @author kimhajin
 *
 */
public class P06_3_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 0;
		
		System.out.println("2 ^ " + n + " = " + nSquare(n));
	}
	
	static int nSquare(int n) {
		if (n > 0)
			return 2 * nSquare(n - 1);
		else
			return 1;
	}

}
