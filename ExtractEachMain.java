import java.util.Scanner;
public class ExtractEachMain{

public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter your number here: ");
String numbers = input.nextLine(); 

int length = numbers.length();
int result = 0;
int number = Integer.parseInt(numbers);

if(number < 1 || number > 10000){
System.out.print("This is invalid input"); 
}
else{
for(int index = 0; index < length; index++){
result += number % 10;
number = number / 10;
}
System.out.print("This is the sum of your input: " + result); 
}
}

}