package ch04_3_bit_operators;

public class P04_2_01 {
	public static void main(String[] args) {
		int num = 7;
		int rev = ~num + 1;
		
		System.out.println(num + ", " + rev);
	}
}
