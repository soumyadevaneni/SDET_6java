package Arrays;

public class miniumof_Array {

	public static void min(int arr[]) {
		
		// TODO Auto-generated method stub
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min)
			min=arr[i];
		}
			System.out.println(min);
		}
	public static void main(String args[])
	{
		int a[]= {118,456,878,675,456,123};
		min(a);

	}
		
	}


