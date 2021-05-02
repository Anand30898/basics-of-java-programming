//find largest and smallest number in array//
//So,the a[0] is set as max in case 1 and the a[0] is set as min in case 2 and then each value present in the array is compared or merge in one if u like;
public static void main{
int a[]= {18,48,54,79,51};
int max=a[0];
for(int i=0;i<a.length;i++) {
if(a[i]>max) {
max=a[i];
}}
System.out.print(max);
for(int i=0;i<a.length;i++) {
if(a[i]<min) {
min=a[i];
}}
System.out.print(min);
}
----------------------------------------------------
  //one more method
  import java.util.*;
  public static void main{
    int a[]= {18,48,54,79,51};
    Arrays.sort(a);
    System.out.print("Min is"+a[0]+"and Max is"+a[a.length-1]);
  }
