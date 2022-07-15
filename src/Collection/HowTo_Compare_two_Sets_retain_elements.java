package Collection;

import java.util.HashSet;
import java.util.Set;

public class HowTo_Compare_two_Sets_retain_elements {

	public static void main(String[] args) {
		 Set<String>s=new HashSet<String>();
	      s.add("java");
	      s.add("python");
	      s.add("html");
	      s.add("law");
	      s.add("FM");
	     
	      System.out.println("Set:"+s);
	      
	      HashSet<String>h=new HashSet<String>();
	        h.add("html");
	        h.add("python");
	        s.retainAll(h);
	        System.out.println("After retain all:"+s);
	}

}
