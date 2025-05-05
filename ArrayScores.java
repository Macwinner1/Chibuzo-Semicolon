public class ArrayScores{
public static void main(String[] args){

int[] scores = new int[5];
scores[0] = 22;
scores[1] = 51;
scores[2] = 38;
scores[3] = 23;
scores[4] = 48;

int index0 = scores[0];
int index1 = scores[1];
int index2 = scores[2];
int index3 = scores[3];
int index4 = scores[4];

System.out.print(index0 + " " + index1 + " " + index2 + " " + index3 + " " + index4);

System.out.println("\t \n" + index0 + " \n" + index1 + " \n" + index2 + " \n" + index3 + " \n" + index4);

for(int count = 0; count <= scores.length-1; count++){
System.out.print(scores[count] + " ");
}

}

}