import java.util.Scanner;

public class MortgageCalculator{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter the principal amount: ");
double amount = input.nextDouble();

System.out.print("Enter the annual interest rate: ");
double annualRate = input.nextDouble() / 100;

System.out.print("Enter the duration in years: ");
double duration = input.nextDouble() * 12;

double monthlyRate = annualRate / 12;


double monthly = amount * (monthlyRate * Math.pow(1 + monthlyRate, duration)) / (Math.pow(1 + monthlyRate, duration) - 1);

System.out.printf("Your monthly payment is $%.2f", monthly);
}


}