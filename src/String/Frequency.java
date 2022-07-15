package String;

public class Frequency {

	public static void main(String[] args) {
		String s="aabcd";
		
		 for(char ch='a';ch<='z';ch++)
		 {
		 int count=0;
		 for(int i=0;i<s.length();i++)
		 {
		 if(ch==s.charAt(i))
		 {
		 count++;
		 }}
		 if(count>0)
		 System.out.print(ch+"-"+count);
}}}


