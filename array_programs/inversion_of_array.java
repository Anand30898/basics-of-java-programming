//inversion of the array
//please check the inversion theory from internet
class Main{
  public static void main(String[] args){
    int a[]= {2,4,1,3,6,5};
    int n=a.length;
    int inv=0;
    for(int i=0;i<n;i++) {
    for(int j=i+1;j<n;j++) {
    if(a[i]>a[j]&&i<j) {
    inv++;
    }
    }
    }
    System.out.print(inv);
  }
}
