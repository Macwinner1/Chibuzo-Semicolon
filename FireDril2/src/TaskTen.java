import java.util.Scanner;

public class TaskTen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int vaild = 0;
        int count = 0;
        while(count < 10){
            System.out.print("Enter number: ");
            int number = input.nextInt();
            if(number > 0 && number <= 100){
                total += number;
                vaild++;
            }
            count++;
        }
        int average = total / vaild;
        System.out.println("average is " + average);

    }
}