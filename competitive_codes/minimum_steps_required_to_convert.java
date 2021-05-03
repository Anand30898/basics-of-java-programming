/*minimum operation required to convert the string from one to another 
for example the string is cur and it has to be changed to car then only one operation is 
required that is to change from you to a then the output of the code is 2*/
String s1="cart";
String s2="marc ";
int c=0;
if(s1.length()!=s2.length()) {
System.out.print("the lengths are not same");
}
if(s1.length()==s2.length()) {
for(int i=00;i<s1.length();i++) {
if(s1.charAt(i)!=s2.charAt(i)) {
c++;
}
}
System.out.print("the number of operations required are  "+c);
} 
/*what if the length of the string is not same then use the mod function find out the diff
and then add that diff to the final operation count because that the number of operation 
required to delete the character from the string conversion or the numbers that are to be
added in the pocess and for the for loop in the place of length use a min function and then 
run the loop for the minimum number of the times so that the operation is performed*/
