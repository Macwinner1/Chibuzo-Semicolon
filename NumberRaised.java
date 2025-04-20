import java.util.Scanner;

public class NumberRaised{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter a number: ");
int number1 = input.nextInt();
System.out.print("Enter base number: ");
int number2 = input.nextInt();

int result = 1;

for(int counter = 1; counter <= number2; counter++){
result *= number1;
}

System.out.print("this number raised to power is: " + result);

}
}