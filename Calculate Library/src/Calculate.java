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
	public static double absValue(double num) {
		if (num > 0) {
			return num;
		}
		else {
			return (num*-1);
		}
	}
	//returns the higher of two inputs
	public static double max(double num1, double num2) {
		if (num1 > num2) {
			return num1;
		}
		else {
			return num2;
		}
	}
	//returns the highest input
	public static double max(double num1, double num2, double num3) {
		if (num1 >= num2 && num1 >= num3) {
			return num1;
		}
		else if (num2 >= num3 && num2 >= num1) {
			return num2;
		}
		else {
			return num3;
		}
	}
	//returns the smallest input
	public static int min(int num1, int num2) {
		if (num1 < num2) {
			return num1;
		}
		else if (num2 < num1) {
			return num2;
		}
		else {
			return num1;
		}
	}
	//returns the smallest input (double)
	public static double min(double num1,double num2) {
		if (num1< num2) {
			return num1;
		}
		else if (num2 < num1) {
			return num2;
		}
		else {
			return num1;
		}
	}
	//rounds input to two decimal places
	public static double round2(double num) {
		//if input is positive
		if (num > 0) {
			if (num * 1000 % 10 < 5) {
				return (num * 1000 - num * 1000 % 10)/1000;
			}
			else {
				return (10 - num * 1000 % 10 + num * 1000)/1000;
			}
		}
		//if input is negative
		else {
			num *= -1; //a = a* -1
			if (num * 1000 % 10 < 5) {
				return (num * 1000 - num * 1000 % 10)/1000;
			}
			else {
				return (10 - num * 1000 % 10 + num * 1000)/-1000;
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
	public static int factorial(int num) {
		int answer = 1;
		if (num == 0) {
			answer = 1;
			return answer;
		}
		else {
			for (int i=1; i <= num; i++) {
				answer *= i;
			}
		return answer;
		}
	}
	//determines if input is prime
	public static boolean isPrime(int num) {
		boolean answer;
		boolean isPrime = true;
		if(num > 1) {
			for (int i = num-1; i > 1; i--) {
				answer = isDivisibleBy(num,i); 
				if (answer == true) {
					isPrime = false;
				}
			}
		}
		else if(num == 1) {
			isPrime = true;
		}
		else {
			isPrime = false;
		}
		return isPrime;
	}
	//returns the greatest common factor of two positive inputs
	public static int gcf(int num1,int num2) {
		for(int factor = num1; factor > 1; factor--) {
			boolean divisible1 = Calculate.isDivisibleBy(num1,factor);
			boolean divisible2 = Calculate.isDivisibleBy(num2,factor);
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
	public static String quadForm(int num1,int num2,int num3) {
		double discriminant = discriminant(num1,num2,num3);
		String roots;
		if(discriminant>0) {
			roots = min(round2(-num2 + sqrt(discriminant)) /2*num1, round2(-num2 - sqrt(discriminant)) /2*num1) + " and " + max(round2(-num2 + sqrt(discriminant)) /2*num1, round2(-num2 - sqrt(discriminant)) /2*num1);
		}
		else if(discriminant == 0) {
			roots = round2(-num2/2*num1) + "";
		}			
		else {
			roots = "no real roots";
		}
		return roots;
	}
}


