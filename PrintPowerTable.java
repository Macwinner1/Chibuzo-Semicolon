public class PrintPowerTable{
public static void main(String[] args){

System.out.printf("%-10s%-10s%-10s", "A", "B", "Pow(A, B)\n");

 
int number1 = 0;
int number2 = 1;
int result = 1;

for(int count = 1; count <= 5; count++){

for(int power = 1; power >= 1; power--){
number1++;
number2++;
result = 1;

}
for(int outt = 1; outt <= number1; outt++){
result = result * number1;
}
System.out.printf("%-10d%-10d%-10d", number1, number2, result);
System.out.println();
}


}
}