/*find the numbers of pairs of socks present of the same rating.explanation:-so 
there is an array contains numbers if the numbers are same then it is a pair and the output
should be the number of pairs in the array.[10,20,20,10,5,10,30,30] so there is are three 
pairs [10,10],[20,20],[30,30] and the output is 3.
A8--> so the code is very simple we made a set containing the values and if the values
 is not present in the array then add the values and if the values are present in the array
then num++ and remove the values so that is the numbers if are odd then it should not create a 
mess.*/
public static void main(String[] args){
    int ar[]= {10,20,20,10,30,5,10};
    int num=0;
    if(ar.length==0) {
    System.out.print("there is no element in the array");
    }
    Set<Integer> s = new HashSet();
    for(int i=0;i<ar.length;i++) {
    if(!s.contains(ar[i])) {
    s.add(ar[i]);
    }
    else {
    num++;
    s.remove(ar[i]);
    }
    }
    System.out.print(num);
}
