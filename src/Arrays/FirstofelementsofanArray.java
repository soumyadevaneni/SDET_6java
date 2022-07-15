package Arrays;

import java.util.Scanner;

public class FirstofelementsofanArray {

	public static void main(String[] args) {
    
		/*
		 * Scanner sc = new Scanner(System.in); System.out.println(" enter the size ");
		 * int size = sc.nextInt(); int arr[] = new int[size];
		 * System.out.println(" enter the values ");
		 */
		int arr[]= {1,2,3,4,5,6};
		{
			int temp;
			for(int i=0;i<arr.length;i++) {
		
		
		for (int j=0;j<arr.length/2;j++ )
		
			
		if(arr[j]>arr[j+1]) {
			temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
			
			
		}}
		
	    System.out.println();
	
	}}}

	
