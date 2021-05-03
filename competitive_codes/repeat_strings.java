/*repeat string:-in this question u have to count the number of times 'a' occured in the 
particular string for which a value n is specified so that the string is repeated till that 
length ,for eg. string aba is given with the value 10 so the final string will be abaabaabaa 
and the answer should be 7.
So the solution is simple first we count the number of a in the given string then we 
just divide the length of the string with the given value 10/3 = 3 in this case and then we 
multiply the times of a to this count=2*3=6 in this case now we just check the remaining
times the loop and the value a 10%3=1 in this case and as a is present in the letter then 
increment the count 6+1=7 in this case the prob is solved.*/
public static void main(String[] args){
int n=10;
int count =0;
String s="aba";
for(int i=0;i<s.length();i++) {
if(s.charAt(i)=='a') {
count++;
}}
int rep=n/s.length();
count=count*rep;
int g= n%s.length();
for(int i=0;i<g;i++) {
if(s.charAt(i)=='a') {
count++;
}
}
System.out.println(count);
}
