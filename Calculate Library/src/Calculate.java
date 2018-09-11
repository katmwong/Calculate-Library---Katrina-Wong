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
	public static int toImproperFrac(int a, int b, int c) {
		int answer;
		answer = ((a*c)+b + "/b");
		return answer:
	}
}
