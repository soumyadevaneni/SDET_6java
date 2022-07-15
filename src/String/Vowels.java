package String;

import java.util.LinkedHashSet;

public class Vowels {

	public static void main(String[] args) {
    
	 String []s= {"Test","yantra","Hyderabad"};
	 
	 
		
		int count = 0;
		
		//Taking Single String with For Loop
		for(int i=0; i<s.length; i++)
		{
			char[] ch2 = s[i].toLowerCase().toCharArray();
			
			//Storing Values into LinkedHashSet to eliminate duplicates
			LinkedHashSet<Character> lhs=new LinkedHashSet<>();
			for(Character a:ch2)
			{
				lhs.add(a);
			}
			for(Character ch:lhs)
			{	
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					count++;
				}
			}
			System.out.println(s[i]+"  "+count);
			count=0;
		}
	 
	}

}
