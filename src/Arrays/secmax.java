package Arrays;

public class secmax {

	
		// TODO Auto-generated method stub
		public static void Secmax(int arr[]) {
			
			int max=arr[0],secmax=arr[0];
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]>max)
				{
					secmax=max;
					max=arr[i];
				
					
				}
				
				 else if(arr[i]>secmax) { 
					 secmax=arr[i];
					 }
				 
			}
			System.out.println("Max:"+max);
			System.out.println("SecMax:"+secmax);
			}
			public static void main(String args[])
			{
				int a[]= {878,456,678,666,887,998,911};
				Secmax(a);
		        

	}

}
