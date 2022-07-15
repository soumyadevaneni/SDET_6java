package Collection;

import java.util.HashSet;
import java.util.Set;

public class Set_Content_another_Set {

	public static void main(String[] args) {
  
    Set<String>s=new HashSet<String>();
      s.add("java");
      s.add("python");
      s.add("html");
     
      System.out.println("Set:"+s);
      
      HashSet<String>h=new HashSet<String>();
        h.add("sql");
        h.add("law");
        s.addAll(h);
        System.out.println("After modification:"+s);
        
      
	}

}
