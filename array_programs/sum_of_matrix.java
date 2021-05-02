//find the sum/difference of diagonals of the matrix//

public static void main(String[] args){
int a[][]= {{1,4,2},{2,8,9},{6,8,9}};
int n=a.length;
int sum=0;
int ansum=0;
for(int i=0;i<n;i++) {
sum=sum+a[i][i];
ansum=ansum+a[i][n-1-i];
}
System.out.println(sum);
System.out.println(ansum);
int r= Math.abs(sum-ansum);
System.out.print("the result is "+r);
}
