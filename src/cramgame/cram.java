package cramgame;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class cram {
	
	static	ArrayList<Integer> array =new ArrayList<Integer>();
	public static int calculate(int n) {
	array=new ArrayList<Integer>();
		if (n==0|| n==1 || n==2  ) return 0;
			if (n==3 || n==4 || n==5) return 1;
		
		for(int i=0;i <= n;i++) {
			array.add(i,calculateGrundy(i) );;
		}
	
		return array.get(n);
		
		
	}
	public static  int calculateGrundy (int n)
	{
		
		//stop condition 
		if (n==0|| n==1 || n==2  ) return 0;
		if (n==3 || n==4 || n==5) return 1;
		
		//A set to calculate the mex of grundy numbers .
		Set<Integer> Set = new HashSet<Integer>();  
		

		//array.set(2, 1);
		
				
			for (int i=0 ; i<n/2 ;i++)
				//the first player choose a square.
				Set.add((array.get(n-i-3))^(array.get(i)));
			    

		//return the mex of grundy numbers.
		return (calculateMex(Set));
		}
	
	public static int calculateMex(Set<Integer> Set)
	{
	    int Mex = 0;
	    while (Set.contains(Mex))
	        Mex++;
	    return Mex;
	}
	   
 public static void main(String[] args)
 {
	 System.out.println(calculate(10));
	 System.out.println(calculate(7));
	 
 }
}

