public class TableFunction{

public static void  MultiplicationTableFunction(int number1, int number2){

System.out.print("              Multiplication  Table\n");
System.out.print("     ");
for(int head = number1; head <= number2; head++){
System.out.printf("%-5d", head);
}
System.out.println("\n");

for(int index = number1; index <= number2; index++){
	System.out.print(index + "|  ");
	for(int index2 = number1; index2 <= number2; index2++){
		int result = index * index2;
		System.out.printf(" %-4d", result);
	}
	System.out.println();

}

}

}
