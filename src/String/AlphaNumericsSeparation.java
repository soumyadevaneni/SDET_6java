package String;
public class AlphaNumericsSeparation {

	public static void main(String[] args) {
    
		
			String str="soumya123@@";
			String s="";
			String number="";
			int specialcharacter=0;
			int count1=0;
			int count2=0;
			
			for(int i=0; i<str.length(); i++)
			{
				char c=str.charAt(i);
				
				if((c>='a'&& c<='z') || (c>='A'&& c<='Z'))
				{
					s=s+str.charAt(i);
					count1++;
				} 
				
				else if((c>='0') && (c<='9'))
				{
					number=number+str.charAt(i);
					count2++;
				}
				else {
					specialcharacter++;
				}
			}
			System.out.println("String is :"+s);
			System.out.println("count chars :"+count1);
			System.out.println("Num are :"+number);
			System.out.println("count Nos :"+count2);
			//System.out.println("alpha num :"+(str.length()-(count1+count2)));
			System.out.println("special char:"+specialcharacter);
			
		

	
	}

}
