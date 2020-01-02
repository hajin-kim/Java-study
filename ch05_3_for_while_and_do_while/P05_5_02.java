/**
 * 
 */
package ch05_3_for_while_and_do_while;

import java.util.Scanner;

/**
 * @author kimhajin
 *
 */
public class P05_5_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int inp = sc.nextInt();

		for (int i = 1; i < 10; i++) {
			System.out.println(inp + " * " + i + " = " + inp * i);
		}
	}

}
