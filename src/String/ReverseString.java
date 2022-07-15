package String;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="Testing";
		String s="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			s=s+s1.charAt(i);
		}
		System.out.println("reverse of string is:"+s);
	}

}
