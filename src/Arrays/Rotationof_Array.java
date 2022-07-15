package Arrays;

import java.util.Arrays;

public class Rotationof_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1,2,3,4,5,6,7,8 };
		System.out.println("Input Array: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");

		}
		int first=a[0];
		for(int j=0;j<a.length-1;j++)
		{
			a[j]=a[j+1];

		}
		a[a.length-1]=first;
		System.out.println();
		System.out.println("Output Array:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");

		}



	}
}

