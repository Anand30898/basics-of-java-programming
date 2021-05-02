//Question :-count the number of triplets such that the sum of the third element is equal to the rest two
import java.util.*;
class Main{
  public static void main(String[] args){
    int a[]= {1,2,5,3,6};
    int count=0;
    int n=a.length;
    Arrays.sort(a);
    for(int i=0;i<n;i++) {
    if(i<n-2)
    if(a[i]+a[i+1]==a[i+2]) {
    count++;
    }
    }
    System.out.print(count);
  }
}  
