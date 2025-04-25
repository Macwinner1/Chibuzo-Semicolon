import java.util.Scanner;
public class ValidScore{
public static void main(String[] args){

Scanner input = new Scanner(System.in);


int score = 0;
int countA = 0;
int countB = 0;
int countC = 0;
int countD = 0;
int countF = 0;
int countInValid = 0;
int countValid = 0;
int count = 0;

for(; count <= countValid; ){
System.out.println("Enter a valid Score from 0 - 100");
score = input.nextInt();

if(score < 0 || score > 100){
System.out.println("Invalid Score.. Input a valid Score");
countInValid++;
continue;
}

switch(score / 10){
case 10: System.out.println("Grade A"); countA++; countValid++; break;
case 8:	 System.out.println("Grade A"); countA++; countValid++; break;
case 9:  System.out.println("Grade A"); countA++; countValid++; break;
case 7: System.out.println("Grade B"); countB++; countValid++; break;
case 6: System.out.println("Grade C"); countC++; countValid++; break;
case 5: System.out.println("Grade D"); countD++; countValid++; break;
case 4: System.out.println("Grade F"); countF++; countValid++; break;
case 3: System.out.println("Grade F"); countF++; countValid++; break;
case 2: System.out.println("Grade F"); countF++; countValid++; break;
case 1: System.out.println("Grade F"); countF++; countValid++; break;
case 0: System.out.println("Grade F"); countF++; countValid++; break;

}

count++;

if(countValid == 10){
break;
}

}

System.out.println("Report of Total Valid Scores: " + countValid);
System.out.println("Report for grade A: " + countA);
System.out.println("Report for grade B: " + countB);
System.out.println("Report for grade C: " + countC);
System.out.println("Report for grade D: " + countD);
System.out.println("Report for grade F: " + countF);
System.out.println("Report of Total InValid Scores: " + countInValid);





}



}