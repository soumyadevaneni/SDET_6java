package String;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="soumyalatha";
		StringBuilder sb1=new StringBuilder();
		Set<Character>set=new LinkedHashSet();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
			
		}

		for(Character c:set) {
			sb1.append(c);
		}
		System.out.println(sb1);
	}

}
