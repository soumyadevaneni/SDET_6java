
package String;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Longestsubstring_without_reapting {
	
	
	
public static void LengthofLongestSubstring(String s) {
	String LongestSubstring=null;
	int LongestSubstringLength=0;
	
	Map<Character, Integer>map=new LinkedHashMap();
	 char[]chars=s.toCharArray();
	 for(char ch:chars) {
		 if(!map.containsKey(ch)){
			 map.put(ch, 1);
		 }
		 
		 else {
			 int value=map.get(ch);
			 map.clear();
		 }
  if(map.size()>LongestSubstringLength) {
	  LongestSubstringLength=map.size();
	  LongestSubstring=map.keySet().toString();
  }
	 }
	 System.out.println("The longest substring:"+LongestSubstring);
	 System.out.println("The longest substring length:"+LongestSubstringLength);
}

	public static void main(String[] args) {
		LengthofLongestSubstring("soumyalatha");
	}
}

