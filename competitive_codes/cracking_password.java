/*
to crack a encrypted password condutions are 
1. it should contain all +ve numbers
2. there are black spaces in password denoted by -1 
3.if -1 encountered then if the both previous and next value is odd or even then print the
absolute value of the difference 
4.if the previous and the next value is one odd and one even then add both and then div by 2
and print the floor of the result 
5.after all the steps subtract each digit by 1 except the last and the digit with is equal to 
1
6.the blacnk shold not be in the first or last place.
i/p
9(-1)812 --> 87712;
814-->714,
*/

public static void main(String[] args)  {
	int a[]= {9,-1,8,1,2};
	int n=a.length;
	int z=0;
	for(int i=0;i<n;i++) {
	if(a[i]==-1) {
	z=a[i-1]+a[i+1];
	if(z%2==0) {
	a[i]=Math.abs(a[i-1]-a[i+1]);
	}
	else {
		a[i]=Math.floorDiv(z, 2);
	}	
		}}
	for(int j=0;j<n;j++) {
	if(j>=0&&j<n-1&&a[j]>1) {
	a[j]--;
	System.out.print(a[j]);
	}
	else

		System.out.print(a[j]);
	}

}
