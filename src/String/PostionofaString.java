package String;

import java.util.LinkedHashSet;

public class PostionofaString {

	public static void main(String[] args) {
   
		String  s="khatham ta ta bye bye";
       
		String s1[]=s.split(" ");
		
		LinkedHashSet<String>ls=new LinkedHashSet<String>();
		
       for(int i=0;i<s1.length;i++)
       {
    	   ls.add(s1[i]);// [khatham,ta,by]
       }
       for(String str:ls)
       {
    	   for(int i=0;i<s1.length;i++) {
    		   
    	   
    		
    		   if(str.equals(s1[i])) {
    			  
    			   System.out.println(str+"positon is:"+(i+1));
    			   break;
    		   }
       }
       
	                                                                                                                                 
       }}}
		
		
	
                                                                                                                                                                                                                                                                                                                                                                                                                                                    

