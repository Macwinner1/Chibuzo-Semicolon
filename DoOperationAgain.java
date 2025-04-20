import java.util.Scanner;
public class DoOperationAgain{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int result = 0;

do{
System.out.print("Enter a number: ");
int number1 = input.nextInt();
System.out.print("Enter a number: ");
int number2 = input.nextInt();
result = number1 + number2;

} while(result != 0);
System.out.print("Do You wish to perform this operation again? ");



}

}