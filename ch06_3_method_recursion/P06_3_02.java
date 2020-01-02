/**
 * 
 */
package ch06_3_method_recursion;

/**
 * @author kimhajin
 *
 */
public class P06_3_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		binary(11);
	}

	static void binary(int inp) {
		if (inp > 1)
			binary(inp / 2);
		System.out.print(inp % 2);
	}
}
