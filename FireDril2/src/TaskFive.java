import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        for(int counter = 1; counter <= 10; counter++){
            System.out.print("Enter number: ");
            int number = input.nextInt();
            if(number%2 == 0){
                total += number;
            }
        }
        System.out.println("Total is " + total);

    }
}