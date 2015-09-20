package Fraction;

public class FractionMain {

	
	public static void main(String[] args) throws Exception {
		
		Fraction fractionOne = new Fraction(1,3);
		Fraction fractionTwo = new Fraction(1,2);
		
	    System.out.println("After addition "+Fraction.add(fractionOne, fractionTwo).toString());
	    System.out.println("After subtraction "+Fraction.subtract(fractionOne, fractionTwo).toString());
	    System.out.println("After multiplying "+Fraction.multiply(fractionOne, fractionTwo).toString());
	    System.out.println("After dividing "+Fraction.divide(fractionOne, fractionTwo).toString());
	    Fraction.isEqualTo(fractionOne, fractionTwo);
	
		Fraction.isNegative(fractionOne);
		

	}

}
