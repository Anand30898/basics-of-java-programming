/*count the valley prob :- the problem starts with the letters such as D and U so that
we have to calculate the number of valleys he croseed before reaching to the actuall level
A9-->the solution states as follows that if the code encounters -1 when going up it encounter
the valley prior to it.*/
public static void main(String[] args){
String s[] = {"D","D","U","U","D","D","U","D","U","U","D"};
int altitude=0;
int num=0;
int n= s.length;
for(int i=0;i<n;i++) {
	if(s[i]=="U") {
		if(altitude==-1) {
			num++;
		}
		altitude++;
	}
	if(s[i]=="D") {
		altitude--;
	}
}
System.out.print(num);
}
//in case it is a one string problem then we should use charAt function for the same and the following code is solved
