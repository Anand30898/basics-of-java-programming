//Rearrange the array alternately//
/*An amazing question,So the trick to solve this question is that taking we take the iterations 
n-1/2 times and printing the max and the small value simultaneously but in case of odd numbers
it will also show the duplicate number making it an even array so that if statement is used */
public static void main(String[] args){
int a[]= {1,1,2,2,3};
int n =a.length;
for(int i=0;i<=((n-1)/2);i++) {

int max=a[n-1-i];
int small=a[i];
System.out.println(max);
if((n/2)!=i) {
System.out.println(small);
}
}
}
