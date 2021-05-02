//to find duplicate number in array//
//So, the point here is checking the index value a[i] and a[i+1] and if the values are equal return the value
import java.util.*;
class main{
  public static void main(String[] args){
    int a[]= {1,2,3,5,2,8,8,3};
    int n=a.length;
    for(int i=0;i<n;i++) {
    for(int j=i+1;j<n;j++) {
    if(a[j]==a[i]) 
    System.out.print(a[j]+" ");
    }
    }      
    
