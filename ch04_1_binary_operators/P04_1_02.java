package ch04_1_binary_operators;

public class P04_1_02 {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		boolean result;
		
		// result = ((num1 += 10) < 0) && ((num2 += 10) > 0);
		num1 += 10;
		num2 += 10;
		result = (num1 < 0) && (num2 > 0);
		
		System.out.println("result = " + result);
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2 + '\n');

		// result = ((num1 += 10) > 0) || ((num2 += 10) < 0);
		num1 += 10;
		num2 += 10;
		result = (num1 > 0) || (num2 < 0);
		
		System.out.println("result = " + result);
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
	}
}
