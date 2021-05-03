//arrange an array so the max number appears on the given postion
public static void main(String[] args){
    int a[]= {20,50,40,30,70,80,90,100};
    int k=3;
    int n=a.length;
    Arrays.sort(a);
    int max= a[n-1];
    for(int i=0;i<n-1;i++) {
    if(i==k) {
    System.out.print(max +" ");
    System.out.print(a[i]+" ");
    }
    else
    System.out.print(a[i]+" ");
    }
}
