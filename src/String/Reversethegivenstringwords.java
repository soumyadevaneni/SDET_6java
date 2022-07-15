package String;

public class Reversethegivenstringwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s="welcome java and selenium";
       String s2[]=s.split(" ");
       for(int i=0;i<s2.length;i++)
       {
       	char ch[]=s2[i].toCharArray();
       	for(int j=ch.length-1;j>=0;j--)
       	{
       		System.out.print(ch[j]);
       	}
       	System.out.print(" ");

       
           	   }
       }}
	


