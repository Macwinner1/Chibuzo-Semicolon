import java.util.Scanner;
public class DoOperationAgain{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int result;
int count;

do{
System.out.print("Enter a number: ");
int number1 = input.nextInt();
System.out.print("Enter a number: ");
int number2 = input.nextInt();
result = number1 + number2;
System.out.println("Here is the: " + result);

System.out.println("Do You wish to perform this operation again? press (0) to contiune ");
count = input.nextInt();

} while(count != 0);
System.out.print("You have quit");



}

}