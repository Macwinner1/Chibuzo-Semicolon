import java.util.Scanner;
import java.util.InputMismatchException;

public class TicTacToeGame{

 static String[] board;
 static String turn;

 static void printBoard() {
System.out.println(board[0] + "|" + board[1] + "|" + board[2]);
System.out.println("-+-+-");
System.out.println(board[3] + "|" + board[4] + "|" + board[5]);
System.out.println("-+-+-");
System.out.println(board[6] + "|" + board[7] + "|" + board[8]);
 }

 static String checkWinner(){
 for (int index = 0; index < 8; index++){
 String line = "";

 switch(index){
 case 0: line = board[0] + board[1] + board[2]; break;
 case 1: line = board[3] + board[4] + board[5]; break;
 case 2: line = board[6] + board[7] + board[8]; break;
 case 3: line = board[0] + board[3] + board[6]; break;
 case 4: line = board[1] + board[4] + board[7]; break;
 case 5: line = board[2] + board[5] + board[8]; break;
 case 6: line = board[0] + board[4] + board[8]; break;
 case 7: line = board[2] + board[4] + board[6]; break;
 }

 if (line.equals("XXX")) return "X";
 else if (line.equals("OOO")) return "O";
 }

 for (int i = 0; i < 9; i++) {
 if (board[i].equals(String.valueOf(i + 1))) {
 return null; 
 }
 }

 return "draw"; 
 }

 public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
 board = new String[9];
 turn = "X";
 String winner = null;

 
 for (int index = 0; index < 9; index++) {
 board[index] = String.valueOf(index + 1);
 }

 System.out.println("Welcome to 3x3 Tic Tac Toe!");
 printBoard();
 System.out.println("X will play first. Enter a slot number to place X in:");

 while (winner == null) {
 int numInput;

 try {
 numInput = in.nextInt();
 if (numInput < 1 || numInput > 9) {
 System.out.println("Invalid input; re-enter slot number (1–9):");
 continue;
 }
 } catch (InputMismatchException e) {
 System.out.println("Invalid input; please enter a number:");
 in.next(); 
 continue;
 }

 
 if (board[numInput - 1].equals(String.valueOf(numInput))) {
 board[numInput - 1] = turn;
 if (turn.equals("X")) {
 turn = "O";
 } else {
 turn = "X";
 }

 printBoard();
 winner = checkWinner();
 } else {
 System.out.println("Slot already taken; re-enter slot number:");
 }
 }

 if (winner.equals("draw")) {
 System.out.println("It's a draw! Thanks for playing.");
 } else {
 System.out.println("Congratulations! " + winner + " has won! Thanks for playing.");
 }

 }
}

