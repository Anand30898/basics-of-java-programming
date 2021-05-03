publis static void main(String[] args){
int a=1634;
int b=a;
int temp=a;
double digit=0;
double n=0;
double s=0;
while(b>0) {
b=b/10;
digit++;
}
while(temp>0) {
n=temp%10;
s=s+Math.pow(n,digit);
temp=temp/10;
}if(a==s) {
System.out.print("arm");
}}
