import java.util.*;
class Main{
 public static void main(String[] args)
 int a[] = {56,78,90,32,67,12}; 
	Arrays.sort(a);
	int b[] = {11,14,9,5,2,23,15};  
	Arrays.sort(b);
	int length = a.length + b.length;  
	int result[] = new int[length];      
	int pos = 0;  
	for (int element : a)  
	{  
	result[pos] = element;  
	pos++;               
	}  
	for (int element : b)  
	{  
	result[pos] = element;  
	pos++;  
	}  
		System.out.println(Arrays.toString(result));  
    
    }
    }
