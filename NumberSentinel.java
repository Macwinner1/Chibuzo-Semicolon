import java.util.Scanner;
public class NumberSentinel{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

int number = 0;
int sentiel = -1;
int largest = 0;
int smallest = 0;

while(number != sentiel){

if(largest <= number){
smallest = largest;
}
if(number > largest){
largest = number;
}
else{
if(number <= largest){
smallest = number;
}
if(largest <= smallest){
smallest = largest;
}
}
System.out.print("Enter any number:");
number = input.nextInt();
}



System.out.println("this is the largest number: " + largest);
System.out.println("this is the smallest number: " + smallest);
}

}