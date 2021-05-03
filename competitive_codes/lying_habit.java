/*for a given person he has a habit of prenouncing wrong shape name when he says Square
 he means triangle,when triangle means rectangle,when rectangle means square he wants you to
calculate area for him i/p be number of test cases,name of the shape and length of 2 sides
in case of triangle 1 side is length and the other is height.*/
import java.util.*;

public static void main(String[] args) {
	
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of test cases");
int t = sc.nextInt();
for(int i=0;i<t;i++) {
double area;
System.out.println("Name the shape");
String shape =sc.next();
System.out.println("length of one side");
double l1 = sc.nextDouble();
System.out.println("length of the other side");
double l2 = sc.nextDouble();
if(shape.equals("square")) {
area = 0.5*l1*l2;
System.out.print("the given area is"+area);	
}
if(shape.equals("rectangle")) {
area = l1*l1;
System.out.print("The given area is"+area);	
}
if(shape.equals("triangle")) {
area = l1*l2;
System.out.println("the given area is"+area);	

}
else
	System.out.println("0");
}
}
