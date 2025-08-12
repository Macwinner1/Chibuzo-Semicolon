import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter 10 numbers: ");
        int score1 = input.nextInt();
        int score2 = input.nextInt();
        int score3 = input.nextInt();
        int score4 = input.nextInt();
        int score5 = input.nextInt();
        int score6 = input.nextInt();
        int score7 = input.nextInt();
        int score8 = input.nextInt();
        int score9 = input.nextInt();
        int score10 = input.nextInt();


        int total = score2 + score4 + score6 + score8 + score10;
        System.out.println("this is total: " + total);

    }
}