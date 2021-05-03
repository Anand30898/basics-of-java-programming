/*write a program in which gives the output required to leave the maximum number of duplicate numbers
operation required for eg, there is an array[1,2,2,3] so the answer is 2 as the array made 
identical a[2,2] 
 the solution is very simple first find the number of thge freq of each element in the 
array then subtract the maximum freq of the element by the length of the array and the ans is 
that only.
this is solved by using Hashmaps*/
public static void main(String[] args){

int a[]= {10,10,10,20,20,30,30,40,45,50};
int n=a.length;
HashMap<Integer,Integer> mp = new HashMap<>();
for(int i=0;i<n;i++) {
int key=a[i];
if(mp.containsKey(key)) {
int freq=mp.get(key);
freq++;
mp.put(key, freq);
}
else
{
mp.put(key, 1);
}
}
int max=0; 
int res=-1;
for(Map.Entry<Integer,Integer> val: mp.entrySet()) {
if(max<val.getValue()) {
res=val.getKey();
max=val.getValue();
}
}
System.out.println(res);
System.out.println(max); 
int c=n-max;
System.out.println(c);
}
/*you can also create a function and that is the best practice also but I am just giving the solution here for simplicity and explanation purpose*/
