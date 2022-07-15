package String;

public class Firstnonrepeted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String inputStr ="teeter";

	        for(char i :inputStr.toCharArray()){
	        if ( inputStr.indexOf(i) == inputStr.lastIndexOf(i)) {
	            System.out.println("First non-repeating character is: "+i);
	            break;
	        }
	        }
	       	        	}
	        }
	    
	
	


