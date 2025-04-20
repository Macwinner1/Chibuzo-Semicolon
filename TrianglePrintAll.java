public class TrianglePrintAll{
public static void main(String[] args){

int max = 10;
char star = '*';

for(int row = 1; row <= max; row++){

for(int col = 1; col <= row; col++){

System.out.print(star);
}
System.out.println(" ");

}



for(int row = 1; row <= max; row++){

for(int col = row; col <= max; col++){

System.out.print(" ");
}
for(int col2 = 1; col2 < row; col2++){

System.out.print(star);

}
System.out.println(" ");

}
System.out.println(" ");


for(int row = 1; row <= max; row++){

for(int col = row; col <= max; col++){

System.out.print(star);
}
for(int col2 = 1; col2 < row; col2++){

System.out.print(" ");

}
System.out.println(" ");

}

for(int row = 1; row <= max; row++){

for(int col = 1; col < row; col++){

System.out.print(" ");
}
for(int col2 = row; col2 < max; col2++){

System.out.print(star);
}

System.out.println(" ");

}




}

}