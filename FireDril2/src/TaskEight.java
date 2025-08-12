import java.util.Scanner;

public class TaskEight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int count = 0;
        while(count < 10){
            System.out.print("Enter number: ");
            int number = input.nextInt();
            if(number > 0 && number <= 100){
                total += number;
                count++;
            }
        }
        System.out.println("total is " + total);

    }
}