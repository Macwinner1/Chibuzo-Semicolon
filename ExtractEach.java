public class ExtractEach{

public static int extractSum(String numbers){
int len = numbers.length();
int result = 0;
int number = Integer.parseInt(numbers);

for(int index = 0; index < len; index++){
result += number % 10;
number = number / 10;

}

return result;
}

}