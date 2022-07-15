package String;

public class Swappingoftwostring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
   String a="java";
   String b="selenium";
   System.out.println("before swapping:");
   System.out.println("The value of a is:"+a);
   System.out.println("The value of b is :"+b);
   a=a+b;
   b=a.substring(0,a.length()-b.length());
   a=a.substring(b.length());
   
   System.out.println("After swapping:");
   System.out.println("The value of a is:"+a);
   System.out.println("The value of b is :"+b);
   
	}

}
