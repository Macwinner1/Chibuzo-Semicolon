public class ExtractEach{

public static int extractSum(String numbers){
int len = numbers.length();
int result = 0;
int number = Integer.parseInt(numbers);

if(number < 1 || number > 10000){
System.out.print("This is invalid input"); 
}
else{
for(int index = 0; index < len; index++){
result += number % 10;
number = number / 10;
}
}
return result;
}

}