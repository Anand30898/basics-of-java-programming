//find the subarray of given sum//
/*So, very crutial prob hence more important the trick to solve this is we take two points consider it to be add and sub. now first whether the given sum is large then the current 
sum and the current sum here is the value of a[0], if the condition is true then we proceed further. first we add the numbers till a point where curr_sum>sum given, now with the help
of sub pointer we remove the value and reduce the curr_sum value to a point when curr_sum<sum now we check curr_sum==sum if the conditions match subarray is printed else again a[i] value 
is added to the array.the complexity of this is O(n) hence the most efficient method.thereis also a method using hashing technique.*/

public static void main(String[] args){
int a[]= {1,2,3,4,5,6};
int n=a.length;
int sum=12;
int curr_sum=a[0];
int start=0;
int i;
for(i=1;i<n;i++){
while (curr_sum > sum && start < i-1) 
{ 
curr_sum = curr_sum - a[start]; 
start++; 
} 
if (curr_sum == sum)  
{ 
int p = i-1; 
System.out.println("Sum found between indexes " + start + " and " + p); 
for(int j=start;j<i;j++) {
System.out.print(a[j]+"\t");
}}
if (i < n) 
curr_sum = curr_sum + a[i]; 	
}
}
