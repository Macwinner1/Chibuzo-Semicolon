public class TicTaeToeFunctions{

public static void printBoard(char[][] board){
System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
System.out.println("-+-+-");
System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
System.out.println("-+-+-");
System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
}



public static Boolean isValidMove(char[][] board, String position, String user){
char symbol = 'X';
if(user.equals("player1")){
symbol = 'X';
player1Position.add(position);
}else if(user.equals("player2")){
symbol = 'O';
player2Position.add(position);
}

switch(position){
	case "1":
		board[0][0] = symbol; break; 
	case "2":
		board[0][1] = symbol; break;
	case "3":
		board[0][2] = symbol; break;
	case "4":
		board[1][0] = symbol; break;
	case "5":
		board[1][1] = symbol; break;
	case "6":
		board[1][2] = symbol; break;
	case "7":
		board[2][0] = symbol; break;
	case "8":
		board[2][1] = symbol; break;
	case "9":
		board[2][2] = symbol; break;
	default:
		System.out.println(":("); break;
}
isValidMove.printBoard(board);
}
/*
public static String checkWinner(){
List topRow = Arrays.asList(1, 2, 3);
List midRow = Arrays.asList(4, 5, 6);
List botRow = Arrays.asList(7, 8, 9);
List leftCol = Arrays.asList(1, 4, 7);
List midCol = Arrays.asList(2, 5, 8);
List rightCol = Arrays.asList(3, 6, 9);
List cross1 = Arrays.asList(1, 5, 9);
List cross2 = Arrays.asList(7, 5, 3);

List<List> winning = new ArrayList<List>();
winning.add(topRow);
winning.add(midRow);
winning.add(botRow);
winning.add(leftCol);
winning.add(midCol);
winning.add(rightCol);
winning.add(cross1);
winning.add(cross2);

for(List win : winning){
if(player1Positions.containsAll(win)){
return "Congratulations Player 1 won!";
} else if(player1Positions.containsAll(win)){
return "Congratulations Player 2 won!";
} else if(player1Positions.size() + player2Positions.size() == 9){
return "Draw!";
}
}


return "";
}
*/



}