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
	//returns the average of two numbers
	public static int average(int number, int number2) {
		int answer; 
		answer = (number + number2) / 2;
		return answer;	
	}
	//converts input radian to degrees
	public static double toDegrees(double number) {
		double answer; 
		answer = (number*3.14159 / 180.0);
		return answer;
	}
	//converts input degrees to radian
	public static double toRadians(double number) {
		double answer;
		answer = (number/180.0 *3.14159);
		return answer;
	}
	//returns the discriminate of input values
	public static int discriminate(int a, int b, int c) {
		int answer;
		answer = ((b*b) - (4*a*c));
		return answer;
	}
	//converts input mixed fraction to an improper fraction
	public static String toImproperFrac(int whole, int numerator, int denominator) {
		String answer;
		answer = ((whole*denominator + numerator) + "/" + denominator);
		return answer;
	}
	//converts input improper fraction to mixed number
	public static String toMixedNum(int numerator, int denominator) {
		String answer;
		answer = (numerator/denominator + " " + numerator % denominator + "/" + denominator);
		return answer;
	}
	//returns quadratic form of input factors
	public static String foil(int a, int b, int c, int d, String x) {
		String answer;
		answer = (a*c) + "x" + "^2" + " + " + ((b*c) + (a*d)) + " + " + (b*d);
		return answer;
	}
	//checks if input cleanly divides 
	public static boolean isDivisibleBy(int a, int b) {
		if (a%b == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	//returns the absolute value of the input
	public static double absValue(double a) {
		if (a > 0) {
			return a;
		}
		else {
			return (a*-1);
		}
	}
	//returns the higher of two inputs
	public static double max(double a, double b) {
		if (a > b) {
			return a;
		}
		else {
			return b;
		}
	}
	//returns the highest input
	public static double max(double a, double b, double c) {
		if (a >= b && b >= c) {
			return a;
		}
		else if (a >= c && c >= b) {
			return a;
		}
		else if (b >= a && a >= c) {
			return b;
		}
		else if (b >= c && c >= a) {
			return b;
		}
		else if (c >= a && a >= b) {
			return c;
		}
		else {
			return c;
		}
	}
	//returns the smallest input
	public static int min(int a, int b) {
		if (a < b) {
			return a;
		}
		else if (b < a) {
			return b;
		}
		else {
			return a;
		}
	}
	
	//rounds input to two decimal places
	public static double round2(double a) {
		//if input is positive
		if (a > 0) {
			if (a * 1000 % 10 < 5) {
				return (a * 1000 - a * 1000 % 10)/1000;
			}
			else {
				return (10 - a * 1000 % 10 + a * 1000)/1000;
			}
		}
		//if input is negative
		else {
			a *= -1; //a = a* -1
			if (a * 1000 % 10 < 5) {
				return (a * 1000 - a * 1000 % 10)/1000;
			}
			else {
				return (10 - a * 1000 % 10 + a * 1000)/1000;
			}
		}
	}
	/*
	//returns an input raised to a positive integer 
	public static double exponent(double base, int exponent) {
		double answer = 1
		for (int i=0; i =< exponent; i++;) {
			product * base;
		}
		return answer;
	}
	//returns the factorial of the value passed
	public static int factorial(int a) {
		int answer = 1
		if (a = 0) {
			return 0;
		}
		else {
			for (int i=1; i =< a; i++) {
				product * i;
		}
		return answer;
		}
	}
	*/
}

