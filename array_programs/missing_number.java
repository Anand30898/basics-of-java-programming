// question:- find the missing number in the series
class Main{
  public static void main(String[] args){
    int a[]= {1,2,4};
    int n=a.length;
    int sum=0;
    int total=((n+1)*(n+2))/2;           //remember this formula only
    System.out.println(total);
    for(int i=0;i<n;i++) {
      sum+=a[i];
    }
    total=total-sum;
    System.out.println(sum);
    System.out.print("the number that was missing was "+total);
}
}
