package Arrays;

import java.util.Arrays;

public class Sorting {
	
	
	public static void main(String args[]) {
		int  arr [] = {230,123,345,456,120};

	System.out.println("Before sorting of an Array:"+Arrays.toString(arr));
		int temp;
		for(int i=0;i<arr.length;i++) {
	  
			
		for(int j=0;j<arr.length-1;j++) {
			
			if(arr[j]>arr[j+1]) {
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}}
		
		for(int k=0;k<arr.length;k++){
		System.out.print(arr[k]+" ");
		  //System.out.println(Arrays.toString(arr));
		}
	}}


		//}


