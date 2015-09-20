package Fraction;

public class Fraction {

	int numerator;
	int denominator;
	
		public Fraction(int n, int d) throws Exception{	
			if(d==0){
				throw new Exception("The denominator cannot be 0");
			}
			numerator=n;
			denominator=d;			
		}
	public int getNumerator() {
			return numerator;
		}
		public void setNumerator(int numerator) {
			this.numerator = numerator;
		}
		public int getDenominator() {
			return denominator;
		}
		public void setDenominator(int denominator) {
			this.denominator = denominator;
		}
		public static boolean isNegative(Fraction f){
			boolean negativeNumber;
			//calculates the fraction whether is negative or positive
			double checkingNumber = f.getNumerator()/f.getDenominator();
			if (checkingNumber<0){
				negativeNumber = true;
				System.out.println("The number is negative!");
			}else{
				negativeNumber = false;
				System.out.println("The number is positive");
			}
			return negativeNumber;
			
		}
		//here used the formula to add two fractions
		public static Fraction add(Fraction f1,Fraction f2) throws Exception{
			int firstPart = f1.getNumerator()*f2.getDenominator();
			int secondPart= f2.getNumerator()*f1.getDenominator();
			int newDenominator = f1.getDenominator()*f2.getDenominator();
			Fraction f3 = new Fraction((firstPart+secondPart), newDenominator);
		
			return f3;
		}
		//here used  the formula to subtract fractions
		public static Fraction subtract(Fraction f1, Fraction f2) throws Exception{
			int firstPart = f1.getNumerator()*f2.getDenominator();
			int secondPart= f2.getNumerator()*f1.getDenominator();
			int newDenominator = f1.getDenominator()*f2.getDenominator();
			Fraction f3 = new Fraction((firstPart-secondPart), newDenominator);
			return f3;
			
		}
		//here again the multiplication formula
		public static Fraction multiply(Fraction f1, Fraction f2) throws Exception{
			int firstPart = f1.getNumerator()*f2.getNumerator();
			int secondPart= f2.getDenominator()*f1.getDenominator();
			Fraction f3 = new Fraction(firstPart, secondPart);
			return f3;
			
		}
		//division formula
		public static Fraction divide(Fraction f1, Fraction f2) throws Exception{
			int firstPart = f1.getNumerator()*f2.getDenominator();
			int secondPart= f1.getDenominator()*f2.getNumerator();
			Fraction f3 = new Fraction(firstPart, secondPart);
			return f3;
			
		}
		//checking whether the two fractions are equal
		public static boolean isEqualTo(Fraction f1, Fraction f2){
			boolean isEqual;
			double numberOneNumerator = f1.getNumerator();
			double numberOneDenominator = f1.getDenominator();
			double result1 = numberOneNumerator/numberOneDenominator;
			double numberTwoNumerator = f2.getNumerator();
			double numberTwoDenominator = f2.getDenominator();
			double result2 = numberTwoNumerator/numberTwoDenominator;
			if(result1==result2){
				isEqual = true;
				System.out.println("The fractions are equal");
			}else{
				System.out.println("The fractions are not equal");
				isEqual = false;
			}
			
			return isEqual;
			
		}
		public String toString(){
			return "the new number is: " + getNumerator()+"/" +getDenominator();
			
			}
	public static void main(String[] args)throws Exception {
	
		
		
		}

	

}
