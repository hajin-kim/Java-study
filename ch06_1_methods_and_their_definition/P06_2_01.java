/**
 * 
 */
package ch06_1_methods_and_their_definition;

/**
 * @author kimhajin
 *
 */
public class P06_2_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r = 5;
		
		System.out.println("Area of the circle: " + circleArea(r));
		System.out.println("Perimeter of the circle: " + circlePerimeter(r));
	}

	static double circleArea(double radius) {
		return radius * radius * 3.14;
	}
	
	static double circlePerimeter(double radius) {
		return radius * 2 * 3.14;
	}
}
