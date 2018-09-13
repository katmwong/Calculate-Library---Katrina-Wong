/* This class contains methods that perform various math operations
 * @Katrina Wong
 * @Version September 6, 2018
 */
public class Calculate {
	//returns the cube  of the input
	public static int cube(int number) {
		int answer;
		answer = number*number*number;
		return answer;
	}
	public static int average(int number, int number2) {
		int answer; 
		answer = (number + number2) / 2;
		return answer;	
	}
	public static double toDegrees(double number) {
		double answer; 
		answer = (number*3.14159 / 180.0);
		return answer;
	}
	public static double toRadians(double number) {
		double answer;
		answer = (number/180.0 *3.14159);
		return answer;
	}
	public static int discriminate(int a, int b, int c) {
		int answer;
		answer = ((b*b) - (4*a*c));
		return answer;
	}
	public static String toImproperFrac(int whole, int numerator, int denominator) {
		String answer;
		answer = ((whole*denominator + numerator) + "/" + denominator);
		return answer;
	}
	public static String toMixedNum(int numerator, int denominator) {
		String answer;
		answer = (numerator/denominator + " " + numerator % denominator + "/" + denominator);
		return answer;
	}
	public static String foil(int a, int b, int c, int d, String x) {
		String answer;
		answer = (a*c) + "x" + "^2" + " + " + ((b*c) + (a*d)) + " + " + (b*d);
		return answer;
	}
	public static boolean isDivisibleBy(int a, int b) {
		if (a%b == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static double absValue(double a) {
		if (a > 0) {
			return a;
		}
		else {
			return (a*-1);
		}
	}
	public static double max(double a, double b) {
		if (a > b) {
			return a;
		}
		else {
			return a;
		}
	}
}

