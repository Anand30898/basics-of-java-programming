//find all the pairs in an array whose sum is given//
//if the array is given {1,2,3,4}, sum=6 then o/p is (2,4)
//So, in this the sum of a[i] and a[i+1] is checked is this is equal to the sum the it is the pair
public static void main(String[] args){
int a[]= {4,5,7,11,9,13,8,12};
int sum=20;
for(int i=0;i<a.length;i++) {
for(int j=i+1;j<a.length;j++) {
if(a[i]+a[j]==sum) {
System.out.println(a[i]+"+"+a[j]+"="+sum);
System.out.println("the pair is ("+a[i]+","+a[j]+")");
}
}
