package Collection;

import java.util.TreeMap;

public class get_All_entry_set_treemap {

	public static void main(String[] args) {
     
		 TreeMap<Integer, String> t=new TreeMap<Integer,String >();
	        t.put(1, "s");
	        t.put(2, "o");
	        t.put(3, "u");
	        t.put(4, "m");
	        
	        System.out.println("elements in treemap1:"+t);
	        
	        System.out.println("Set View: " + t.entrySet());

	}

}
