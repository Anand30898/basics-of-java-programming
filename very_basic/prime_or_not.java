int a =11;//write the number of your choice or input it from the user
public static void main(String[] args){
int c=0;
for(int i=1;i<=a;i++) {
if(a%i==0) {
c++;
}}
if(c==2)
System.out.print("prime");
else
System.out.print("no prime");
}
