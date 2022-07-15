package String;

import java.util.LinkedHashSet;

public class integer {

	public static void main(String[] args) {
     
		String s="123123144342";
		LinkedHashSet<Character>l=new LinkedHashSet<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			l.add(s.charAt(i));
		}
		for(Character ch:l) {
			for(int j=0;j<s.length();j++)
			{
				if(ch.equals(s.charAt(j)))
				{
					System.out.print(s.charAt(j));
				}
			}
			
			System.out.println();
			
	}

}}
