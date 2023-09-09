// This program computes the monthly and total payments of any interest rate and amount
import java.util.Scanner;

public class InterestRate {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter interest rate, years, and amount: ");
		
		double interestrate = input.nextDouble();
		double years = input.nextDouble();
		double amount = input.nextDouble();
		
		input.close();
		
		double monthlyInterestRate = interestrate / 1200 ;
		
		double monthlyPayment;
		
		monthlyPayment = amount * monthlyInterestRate / (1
				- 1/(Math.pow(1 + monthlyInterestRate, years * 12)));
		
		System.out.print("Monthly payment = $" + monthlyPayment);
		
		double totalPayment = monthlyPayment * 12 * years;
		
		System.out.print("\nTotal Payment = $" + totalPayment);
		
	}

}
// Franyatta