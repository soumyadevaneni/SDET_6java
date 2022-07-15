package String;

public class reverseofstringfull {

	public static void main(String[] args) {
    
		String s="we are developers";
		String []s1=s.split(" ");
		String rev="";
		for(String st:s1)
		{
			rev=st+" "+rev;
		}
		System.out.println(rev);
	}

}
