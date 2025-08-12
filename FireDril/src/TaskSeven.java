import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int count = 0;
        for(int counter = 1; counter <= 10; counter++){
            System.out.print("Enter number: ");
            int number = input.nextInt();
            if(number%2 == 0){
                total += number;
                count++;
            }
        }
        int avg = total/count;
        System.out.println("total is " + total);
        System.out.println("average is " + avg);

    }
}