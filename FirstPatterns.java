public class FirstPatterns{
public static void main(String[] args){

for(int count = 1; count < 7; count++){

for(int count1 = 1; count1 <= count; count1++){
System.out.print(count1);

}
System.out.println();

}
System.out.println();


for(int count = 6; count >=1; count--){

for(int count2 = 1; count2 <= count; count2++){
System.out.print(count2);
}
System.out.println();
}
System.out.println();


for(int count = 1; count <= 6; count++){

for(int count1 = 6; count1 >= count; count1--){
System.out.print(" ");
}
for(int count2 = 1; count2 <= count; count2++){
System.out.print(count2);
}
System.out.println();
}
System.out.println();


for(int count = 1; count <= 6; count++){

for(int count1 = 1; count1 < count; count1++){
System.out.print(" ");
}
for(int count2 = count; count2 <= 6; count2++){
System.out.print(count2);
}

System.out.println();
}



}

}
