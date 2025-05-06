public class ArrayKata{

public static int maximumIn(int[] arrayOfIntegers){
int max = arrayOfIntegers[0];
for(int count = 0; count < arrayOfIntegers.length; count++){
if(arrayOfIntegers[count] > max){
max = arrayOfIntegers[count];
}
}
return max;
} 

public static int minimumIn(int[] arrayOfIntegers){
int min = arrayOfIntegers[0];
for(int count = 0; count < arrayOfIntegers.length; count++){
if(min > arrayOfIntegers[count]){
min = arrayOfIntegers[count];
}
}
return min;
} 

public static int sumOf(int[] arrayOfIntegers){
int sum = 0;
for(int count = 0; count < arrayOfIntegers.length; count++){
sum = sum + arrayOfIntegers[count];
}
return sum;
} 

public static int sumOfEvenNumberIn(int[] arrayOfIntegers){
int sum = 0;
for(int count = 0; count < arrayOfIntegers.length; count++){
if(arrayOfIntegers[count] % 2 == 0)
sum = sum + arrayOfIntegers[count];
}
return sum;
} 





}