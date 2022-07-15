package Arrays;

public class Basicprogram {


public static void intarr(int[] a) {
	int[]arr= {1,2,3,4,5};
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
      System.out.println("-----------");
    for(int i=arr.length-1;i>=0;i--)
		
		System.out.println(arr[i]);
	}

	public static void chararr(char[] co) {
		char[]c= {'a','b','c','d'};
		for(int i=0;i<c.length;i++) {
          System.out.println(c[i]);
		}
	    for(int i=c.length-1;i>=0;i--)
 {
			System.out.println(c[i]);
	}}
	public static void String(String[] s) {
		 String[]s1= {"soumya","latha","viyansh"};
			for(int i=0;i<s1.length;i++) {
				System.out.println(s1[i]);
			}

		 for(int i=s1.length-1;i>=0;i--)
		 {
			 System.out.println(s1[i]);
		 }
	}

public static void main(String[] args) {
	int a[]= {1,2,3,4,5};
	char[]co= {'a','b','c','d'};
	 String[]s= {"soumya","latha","viyansh"};

    intarr(a);
    chararr(co);
    String(s);
}}