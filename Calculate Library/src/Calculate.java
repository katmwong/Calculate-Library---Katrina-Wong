/* This class contains methods that perform various math operations
 * @Katrina Wong
 * @Version September 6, 2018
 */
public class Calculate {
	//returns the square of the input
	public static int square(int num) {
		int answer;
		answer = num*num;
		return answer;
	}
	//returns the cube  of the input
	public static int cube(int number) {
		int answer;
		answer = number*number*number;
		return answer;
	}
	//returns the average of two numbers
	public static double average(double number, double number2) {
		double answer; 
		answer = (number + number2) / 2;
		return answer;	
	}
	//returns the average of three numbers
	public static double average(double num,double num2,double num3) {
		double answer;
		answer = (num + num2 + num3) / 3;
		return answer;
	}
	//converts input radian to degrees
	public static double toDegrees(double rad) {
		double answer; 
		answer = (rad*3.14159 / 180.0);
		return answer;
	}
	//converts input degrees to radian
	public static double toRadians(double degree) {
		double answer;
		answer = (degree/180.0 *3.14159);
		return answer;
	}
	//returns the discriminant of input values
	public static int discriminant(int a, int b, int c) {
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
		answer = (numerator/denominator + "_" + numerator % denominator + "/" + denominator);
		return answer;
	}
	//returns quadratic form of input factors
	public static String foil(int a, int b, int c, int d, String x) {
		String answer;
		answer = (a*c) + "x" + "^2" + " + " + ((b*c) + (a*d)) + "x" + " + " + (b*d);
		return answer;
	}
	//checks if input cleanly divides 
	public static boolean isDivisibleBy(int a, int b) {
		if (a%b == 0) {
			return true;
		}
		else if (b%a == 0) {
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
		if (a >= b && a >= c) {
			return a;
		}
		else if (b >= c && b >= a) {
			return b;
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
	//returns the smallest input (double)
	public static double min(double a,double b) {
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
				return (10 - a * 1000 % 10 + a * 1000)/-1000;
			}
		}
	}
	//returns an input raised to a positive integer 
	public static double exponent(double base, int exponent) {
		double answer = 1;
		for (int i=0; i < exponent; i++) {
			answer *= base;
		}
		return answer;
	}
	//returns the factorial of the value passed
	public static int factorial(int a) {
		int answer = 1;
		if (a == 0) {
			answer = 1;
			return answer;
		}
		else {
			for (int i=1; i <= a; i++) {
				answer *= i;
			}
		return answer;
		}
	}
	//determines if input is prime
	public static boolean isPrime(int a) {
		boolean answer;
		boolean isPrime = true;
		if(a > 1) {
			for (int i = a-1; i > 1; i--) {
				answer = Calculate.isDivisibleBy(a,i); 
				if (answer == true) {
					isPrime = false;
				}
			}
		}
		else if(a == 1) {
			isPrime = true;
		}
		else {
			isPrime = false;
		}
		return isPrime;
	}
	//returns the greatest common factor of two positive inputs
	public static int gcf(int a,int b) {
		for(int factor = a; factor > 1; factor--) {
			boolean divisible1 = Calculate.isDivisibleBy(a,factor);
			boolean divisible2 = Calculate.isDivisibleBy(b,factor);
				if(divisible1 == true && divisible2 ==true) {
					return factor;
				}
			}
		return 1;
		}
	//estimates the square root of a value
	public static double sqrt(double num) {
		double estimate;
		double root;
			root =num/2;
			do{
				estimate = root;
				root = (estimate + (num/estimate))/2;
			}	
			while ((estimate - root) != 0) ;
			return round2(root);
		}
	//returns an approximated root of a quadratic equation
	public static String quadForm(int a,int b,int c) {
		double root1 = Calculate.sqrt(-b + Calculate.discriminant(a,b,c)) /2*a;
		double root2 = Calculate.sqrt(-b - Calculate.discriminant(a,b,c)) /2*a;
		String roots;
		if(root1>0 && root2>0) {
			Calculate.round2(root1);
			Calculate.round2(root2);
			roots = Calculate.min(root1, root2) + " and " + Calculate.max(root1, root2);
			return roots;
		}
		else if(root1 == root2) {
			return Calculate.round2(root1) + "";
		}
		else {
			return "no real roots";
		}
	}
}


