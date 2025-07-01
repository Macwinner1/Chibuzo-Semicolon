public class CharArray{
public static void main(String[] args){

char[][] scores = new char[3][3];
scores[0][0] = 'X'; 
scores[0][1] = 'O';
scores[0][2] = 'X';
scores[1][0] = 'O';
scores[1][1] = 'O';
scores[1][2] = 'O';
scores[2][0] = 'X';
scores[2][1] = 'X';
scores[2][2] = 'O';

for(int count = 0; count < 3; count++){
for(int counter = 0; counter < 3; counter++){
System.out.print(scores[count][counter] + " ");
}
System.out.println();
}

}


}