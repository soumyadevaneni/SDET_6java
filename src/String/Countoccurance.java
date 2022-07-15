package String;

public class Countoccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String input="soumyalatha";
       char  search='a';
       int count=0;
       for(int i=0;i<input.length();i++)
       {
    	   if(input.charAt(i)==search)
    		 count++;
       }
       System.out.println("The chracter"+search+"appears"+count+"times.");
	}

}
