package String;

import java.text.DecimalFormat;

public class Percentageof_Uper_lower_digits_specChar {
	
	public static void getcharPercentage(String s) {
		int len=s.length();
		int uppercaseCount=0;
		int lowercaseCount=0;
		int digits=0;
		int specChar=0;
		for(int i=0;i<len;i++) 
		{
			
		    char ch = s.charAt(i);
		    if(Character.isUpperCase(ch)) {
		    	uppercaseCount++;
		    }
		    else if(Character.isLowerCase(ch)) {
		    	lowercaseCount++;
		    }
		    else if(Character.isDigit(ch)) {
		    	digits++;
		    }
		    else {
		    	specChar++;
		    }
		
		}	
	
	  double upperCasePercentage=(uppercaseCount*100.0)/len;
	  
	  double lowercasePercentage=(lowercaseCount*100.0)/len;
	  double digitsPercentage=(digits*100.0)/len;
	  double specCharsPercentage=(specChar*100.0)/len;
	   System.out.println("In the given String :"+s);
	       DecimalFormat formatter=new DecimalFormat("##.##");
	     System.out.println("uppercase%---->"+formatter.format(upperCasePercentage));
	     System.out.println("lowercase%--->"+formatter.format(lowercasePercentage));
	     System.out.println("digits%--->"+formatter.format(digitsPercentage));
	     System.out.println("specChar%--->"+formatter.format(specCharsPercentage));
	       System.out.println("--------");
		}
	
	public static void main(String[] args) {
		getcharPercentage("Soumya");
		getcharPercentage("SoumyaLatha 123 %#7");

	}

}
