public class PrintPowerTable{
public static void main(String[] args){

System.out.printf("%-10s%-10s%-10s", "A", "B", "Pow(A, B)\n");

int result = 1; 
int power = 2;
int count = 1;

for(; count <=5; count++){
for(; power < 6; power++){
result *= count;

}
}

System.out.printf("%-10d%-10d%-10d", count, power, result);
}
}