package String;

public class RemoveDuplicates_easy {

	public static void main(String[] args) {
    
	String s="soumyalatha";
	String s1="";
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		int a=s1.indexOf(ch);
		if(a==-1) {
			s1=s1+ch;
		}
	}
	System.out.println(s1);
	}

}
