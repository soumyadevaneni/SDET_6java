package String;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="madam";
		String s="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			s=s+s1.charAt(i);
		}
		System.out.println("reverse of string is:"+s);
		if(s1.equalsIgnoreCase(s)) {
			System.out.println("palindrome string");
		}
		else {
			System.out.println("non plaindrome string");
		}
	}
	
	

}
