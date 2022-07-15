package Arrays;

public class Secmin {

	public static void secmin(int arr[])
	{
    
       int min=arr[0],secmin=arr[0];
       for(int i=0;i<arr.length;i++)
       {
    	   if(arr[i]<min)
    	   {
    		   secmin=min;
    		   min=arr[i];
    	   }
    	   else if(arr[i]<secmin) {
    		   secmin=arr[i];
       }
       }
       System.out.println("MIN:"+min);
       System.out.println("Secmin:"+secmin);
	}
	public static void main(String args[]) {
		int a[]= {211,345,450,460,500,600};
		secmin(a);
    	   
       }
	}
	


