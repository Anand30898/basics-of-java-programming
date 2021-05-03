/*find the longest substring of increasing values
an array is given with distinct values the problem is to solve the print the values of the
longest substring increasing value for eg {10,22,9,33,21,50,41,60} array is given and the 
value to print is 5 because of the 10,22,33,50,60 this is the longest substring the length of
the substring is 5
A7-->in the ans we created anither array with all the length and the value of each element
 is 1 and the we just increament the value initially the list array contains all 1 then 
 increment is done with some basic condition and then after the final execution the max value 
 of the array is printed.*/
public static void main(String[] args){
int a[]= {10,22,9,33,21,50,41,60};
int n=a.length;
int list[]=new int[n];
for(int i=0;i<n;i++) {
	list[i]=1;
}
for(int i=1;i<n;i++) {
for(int j=0;j<i;j++) {
if(a[i]>a[j]&&list[i]<list[j]+1) {
list[i]=list[j]+1;
}}}
int max=list[0];
for(int i=0;i<n;i++) {
if(max<list[i]) {
max=list[i];
}
}
System.out.print(max); 	
}  
//in first loop 1 is initiallised in all the elements in secound the condition is checked in
//third max value is returned and the answer is print
