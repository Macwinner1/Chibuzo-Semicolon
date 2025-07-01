import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TicTaeToe{

static ArrayList<Integer>player1 = new ArrayList<Integer>();
static ArrayList<Integer>player2 = new ArrayList<Integer>();

public static void main(String[] args){
char[][] board = {{' ', ' ', ' '},
                  {' ', ' ', ' '}, 
		  {' ', ' ', ' '}};

TicTaeToeFunctions.printBoard(board);
/*
while(true){
Scanner input = new Scanner(System.in);
System.out.println("Where would you like to play? (1-9): ");
String position = input.nextLine();
{
while(player1Positions.contains(player1Position) || player1Positions.contains(player1Position));{
System.out.println("position taken! Enter a correct position");
player1 = input.nextLine();
}

System.out.print(position);

isValidMove(board, position, "player1");


String result = checkWinner();    

while(player2Positions.contains(player2Position) || player2Positions.contains(player2Position));{
System.out.println("position taken! Enter a correct position");
player2 = input.nextLine();
}

isValidMove(board, position, "player2");

printBoard(board);


System.out.println(result);

*/
}

}


