//this program the user gets the input from the user
import java.util.*;
import java.io.*;


 class Main{
  public static void main(String[] args)  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please enter the length of the array");
    int n =sc.nextInt();
    int[] a= new int[n];
    for(int i=0;i<n;i++) {
      a[i]=sc.nextInt();
    }
    //for displaying the array
    System.out.print(Arrays.toString(a));
    //one more method to display the array is as follows
    for(int i=0;i<n;i++){
    System.out.print(a[i]);
    }
  }
}
