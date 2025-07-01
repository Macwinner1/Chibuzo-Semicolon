import java.util.Scanner;
public class FactorialValue{
public static void main(String[] args){

int counter = 1;
int factorial = 0;
int result = 0;


Scanner input = new Scanner(System.in);
System.out.print("Enter any number: ");
factorial = input.nextInt();
int muitiply = factorial;

for(; counter < factorial; ){

result = muitiply * counter;
muitiply = result;
counter++;
}

System.out.print("This is the factorial value of " + factorial + ": " + muitiply);
}

}