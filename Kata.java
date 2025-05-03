public class Kata{

	public static boolean isEven(int number){
	return number % 2 == 0;
	}
	
	public static int subtract(int number1, int number2){
	int total = 0;

	if(number1 < number2){
	total = number2 - number1;
	}
	else{
	total = number1 - number2;
	}
	return total;
	}

	public static boolean isPrimeNumber(int number){
	return number % 2 == 0 || number % 3 == 0;
	}	
	

	public static float divide(float number1, float number2){
	float total = 0;
	
	if(number1 < number2){
	total = number2 / number1;
	}
	if(number2 == 0){
	total = 0;
	}
	else{
	total = number1 / number2;
	}
	return total;
	}
	
	public static int factorOf(int number){
	int total = 0;
	
	for(int count = 1; count <= number; count++){
	if(number % count == 0){
	total++;
	}
	}
	return total;
	}

	public static boolean isSquare(int number){
	int check1 = (int) Math.sqrt(number);
	return check1 * check1 == number;
	}

	public static boolean isPalindrome(int numbers){
	String number = String.valueOf(numbers);
	boolean newNumber2 = false;

	for(int count = 1; count <= number.length(); count++){
	char check1 = number.charAt(0);
	char check2 = number.charAt(1);
	char check3 = number.charAt(3);
	char check4 = number.charAt(4);
	
	if(check1 == check4 && check2 == check3){
	boolean newNumber = true;
	return newNumber;
	}
	}
	return newNumber2;
	}

	public static long factorialOf(int number){
	long total = 1;
	
	for(int count = 1; count <= number; count++){
	total = count * total;
	}
	return total;
	}

	public static long squareOf(int number){
	long total = number * number;
	return total;
	}







}