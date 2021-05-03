public static void main(String[] args){
int a=145;
int n=0;
int f=1;
int s=0;
int b=a;
while(b>0) {
n=b%10;
if(n>0)
for(int i=1;i<=n;i++) {
f=f*i;
}	s=s+f;
System.out.println(s);
b=b/10;
f=1;
System.out.println(b);
}}
