package Arrays;

public class maximumofArray {
	
	
	public static void max(int arr[]) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
			
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
     int []a= {230,450,321,250,560};
     max(a);
	}

}
