/**
 * 
 */

/**
 * @author ICTG_HP
 *
 */

import textio.TextIO;



public class SimpleInterest {

	public static void main(String[] args) {
		
		double principal;
		double rate;
		
		
		
		System.out.println("Enter initial investment: ");
		principal = TextIO.getlnDouble();
		
		
		System.out.println();
		System.out.println("Enter the annual rate.");
		System.out.print("Enter a decimal, not a percentage: ");
		rate = TextIO.getDouble();
		System.out.println();
		
		
		int years;
		
		
		years = 0;
		while (years < 5) {
			double interest;
			interest = principal * rate;
			principal = principal + interest;
			years = years + 1;
			System.out.print("The value of the investment after ");
			System.out.print(years);
			System.out.print(" years is $");
			System.out.printf("%1.2f", principal);
			System.out.println();
		}
	}
	
}
