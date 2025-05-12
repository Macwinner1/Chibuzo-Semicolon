import java.util.Scanner;

public class MultiplicationTest{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter two numbers for multiplication table: ");
int number1 = input.nextInt();
int number2 = input.nextInt();

TableFunction.MultiplicationTableFunction(number1, number2);



}

}