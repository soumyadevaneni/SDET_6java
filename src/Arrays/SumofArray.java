package Arrays;

public class SumofArray {

	public static void main(String[] args) {
     int[]a= {5,4,2,6,3,2,1};
      int sum=0;
      for(int i=0;i<a.length;i++) {
    	 for(int j=0;j<a.length;j++) {
    		 if(a[i]+a[j]==7) {
    			 System.out.println(a[i]+" "+a[j]);
    		 }
    		 
    	 }
      }
	}

}
