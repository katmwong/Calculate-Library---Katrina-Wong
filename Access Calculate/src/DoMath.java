/* This class is client code that uses library to perform various math operations.
 * @Katrina Wong
 * @Version September 6, 2018
 */
public class DoMath {

	public static void main(String[] args){
		System.out.println(Calculate.square(1));
		System.out.println(Calculate.cube(2));
		System.out.println(Calculate.average(3,2,1));
		System.out.println(Calculate.average(3,2));
		System.out.println(Calculate.toDegrees(3.14));
		System.out.println(Calculate.toRadians(180));
		System.out.println(Calculate.discriminant(3,2,1));
		System.out.println(Calculate.toImproperFrac(3,1,2));
		System.out.println(Calculate.toMixedNum(3,2));
		System.out.println(Calculate.foil(3,2,1,4,"x"));
		System.out.println(Calculate.isDivisibleBy(3,6));
		System.out.println(Calculate.absValue(-3.1));
		System.out.println(Calculate.max(-3.1,-3.0));
		System.out.println(Calculate.max(-3.1,2.0,4.1));
		System.out.println(Calculate.min(2,3));
		System.out.println(Calculate.round2(-3.187));
		System.out.println(Calculate.exponent(3.0,2));
		System.out.println(Calculate.factorial(4));
		System.out.println(Calculate.isPrime(85));
		System.out.println(Calculate.gcf(16,24));
		System.out.println(Calculate.quadForm(1,2,3));
	}
}
