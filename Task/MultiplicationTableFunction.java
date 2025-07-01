
public static int MultiplicationTableFunction(int number1, int number2){

System.out.print("              Multiplication  Table\n");
System.out.print("     1    2    3    4    5    6    7    8    9");
System.out.print("--------------------------------------------------");

for(int index = number1; index <= number2; index++){
	print(index + "|  ");
	for(int index2 = number1; index2 <= number2; index2++){
		result = index * index2;
		print(f" %-5d", result);
	}
	println( );

}
}

