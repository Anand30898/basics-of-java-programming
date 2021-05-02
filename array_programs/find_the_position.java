//Question- find the position of the index in the array in which the given sum is present 

class Main{
public static void main(String[] args)
    int a[]= {1, 2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,10};
    int sum =15;
    int asum=0;
    int n=a.length;
    for(int i=0;i<n;i++) {
    for(int j=i;j<n;j++) {
    asum=asum +a[j];
    if(asum==sum) {
    System.out.print("the value of starting index is "+ (i+1)+"the value of the ending index is "+(j+1));
    System.out.println();
    }
    }
    asum=0;
    }
}
}
