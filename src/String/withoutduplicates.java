package String;

import java.util.LinkedHashSet;

public class withoutduplicates {

	public static void main(String[] args) {
    
String s="welcome to india welcome to tyss";
		
		String s1[]=s.split(" ");
		
		LinkedHashSet<String>ls=new LinkedHashSet<String>();
		
		for(int i=0;i<s1.length;i++)
		{
			ls.add(s1[i]);//welcome//to//india//tyss
		}
		
		for(String str:ls) {
			
			int count=0;
			for(int j=0;j<s1.length;j++)
			{
				if(str.equals(s1[j]))
				{
					count++;
				}
			}
			
			System.out.print(str+" ");	 
		 
			}}	
		
	

	

}
