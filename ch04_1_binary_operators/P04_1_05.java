package ch04_1_binary_operators;

public class P04_1_05 {
	public static void main(String[] args) {
		double n1 = ((25 + 5) + (36 / 4) - 72) * 5;
		double n2 = ((25 * 5) + (36 - 4) + 71) / 4;
		double n3 = (128 / 4) * 2;
		
		System.out.println(n1 + ", " + n2 + ", " + n3);
		
		System.out.println((n1 > n2) && (n2 > n3));
	}
}
