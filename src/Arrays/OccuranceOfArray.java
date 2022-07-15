package Arrays;

import java.util.Arrays;

public class OccuranceOfArray {

	public static void main(String[] args) {

		int a[]= {1, 2,3,4,2};
	     Arrays.sort(a);

	     for(int i=0;i<a.length-1;i++)
	     {
			 int count=0;

	    	 for(int j=0;j<a.length;j++)
	    	 {
	    		 if(a[i]==a[j]);
	    		 {
				count++;
	    		 }}
			  System.out.println(a[i]+" ");
				
	    		 } }	
	     
	   //  System.out.println(a[i]+" _"+count);
	}
	
		
	

