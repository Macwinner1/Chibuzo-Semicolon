public class DrillerFunctions{

public static int testDriller(int number){
int result = 0;
int price = 0;

if(number >= 1 || number <= 4)
	price = 2000;
	result = price * number;

if(number >= 5 || number <= 9)
	price = 1800;
	result = price * number;

if(number >= 10 || number <= 29)
	price = 1600;
	result = price * number;

if(number >= 30 || number <= 49)
	price = 1500;
	result = price * number;

if(number >= 50 || number <= 99)
	price = 1300;
	result = price * number;

if(number >= 100 || number <= 199)
	price = 1200;
	result = price * number;

if(number >= 200 || number <= 499)
	price = 1100;
	result = price * number;

if(number >= 500)
	price = 1000;
	result = price * number;



return result;
}

}