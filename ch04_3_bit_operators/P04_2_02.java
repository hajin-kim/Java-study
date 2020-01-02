package ch04_3_bit_operators;

public class P04_2_02 {
	public static void main(String[] args) {
		int num = 15678;
		int bit3 = num << (32 - 3) >>> (32 - 1);
		int bit5 = num << (32 - 5) >>> (32 - 1);
		
		System.out.println(num + ", " + bit3 + ", " + bit5);
	}
}
