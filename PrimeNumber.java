import java.util.Scanner;
public class PrimeNumber{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter a positive number: ");
int number = input.nextInt();

for(int counter = 2; counter <= Math.sqrt(number); counter++){
if(number < 2){
System.out.print(number + " is not a prime number");
}

if(number % counter == 0){
System.out.print(number + " is not a prime number");
break;
}
else{
System.out.print(number + " is a prime number");
}


}


}

}