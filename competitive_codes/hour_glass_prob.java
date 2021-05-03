/*hour glass prob:-a six by six matrix is given 6*6 given and an hour glass is made 
      and the maximum number of patterns that can only be made are 16 patterns
A12--> taking all the indices and adding then and then taking out the max number out after 
comparing it from the value obtained*/
public static void main(String[] args){  
int a[][]= {{1,1,1,0,0,0},{0,1,0,0,0,0},{1,1,1,0,0,0},{0,0,2,4,4,0},{0,0,0,2,0,0},
{0,0,1,2,4,0}};
int rows= a.length;
int columns=a[0].length;
int hour_sum=Integer.MIN_VALUE;
int happy=Integer.MAX_VALUE;
System.out.println(hour_sum);
System.out.println(happy);
for(int i=0;i<rows-2;i++) {
for(int j=0;j<columns-2;j++) {
int new_sum= a[i][j]+a[i][j+1]+a[i][j+2]+a[i+1][j+1]+a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
hour_sum= Math.max(hour_sum, new_sum);
}
}
System.out.print(hour_sum); 
}
//Integer.MIN_value is taken for comparison//
