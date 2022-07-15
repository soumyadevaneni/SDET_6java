package String;

public class Countnoofwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="welcome to india welcome to tyss";
		int count=1;
		for(int i=0;i<s.length();i++) {
		
	
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ') {
				count++;
			}
		}
		System.out.println("count of words:"+count);

}}