package String;

public class removeduplicates {

	public static void main(String[] args) {
   
	String s="aabbccdde";
	
	char[]c=s.toCharArray();
	
	String s2="";
	for(int i=0;i<c.length;i++)
	{
		if(s2.indexOf(c[i])==-1)
		{
			s2=s2+c[i];
		}
	}
	System.out.println(s2);
	}

}
