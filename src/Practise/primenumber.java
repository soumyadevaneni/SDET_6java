package Practise;

public class primenumber {

	public static void main(String[] args) {
      for(int num=100;num<=200;num++) {
  		int count=0;

    	 for(int i=1;i<=num;i++)
    	  {
    		 if(num%i==0)
    			 count++;
    	  }
    	     if(count==2)
    		 System.out.print(num+" ");
          	  }
    	
      }
 	}


