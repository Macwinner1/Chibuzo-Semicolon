import java.util.Arrays;
import java.util.Scanner;
public class ArrayKataTest{

public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.print("Enter how many number you will like to compare: ");
int value = input.nextInt();

int[] numbers = new int[value];

for(int count = 0; count < value; count++){
System.out.print("Enter your numbers: ");
numbers[count] = input.nextInt();
}
System.out.print(Arrays.toString(ArrayKata.sqNumberIn(numbers)));
}

}