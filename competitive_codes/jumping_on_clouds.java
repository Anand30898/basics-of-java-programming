/*jumping on the clouds:-there is a game in which the character is going to jump on 
cloud having the numbr 0 and avoid the clouds having the number 1.the person can either jump
1 step or2  step on the choice and the output should be the minimum number of jumps 
suppose an array is given to in the form of 0,1,0,0,1,0 then minimum numbers of jumps are 
required from 3.
in the above method the path that can be made are 0-->2-->4-->6 or 0-->2-->3-->4-->6 path1 takes 3 and path 2 takes 4 jumps so the output should be 3*/

public static void main(String[] args){
int a[]= {0,1,0,0,1,0};
int n =a.length;
int jumps =0;
int i=0;
while(i<n-1) {
if(i+2==n||a[i+2]==1) {
i++;
jumps++;
}else {
i+=2;
jumps++;
}
}
System.out.print(jumps);
}
//while loop is necessary for such type of question making them easy to solve
