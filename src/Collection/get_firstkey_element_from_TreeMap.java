package Collection;

import java.util.TreeMap;

public class get_firstkey_element_from_TreeMap {

	public static void main(String[] args) {
    
		   TreeMap<Integer, String> t=new TreeMap<Integer, String>();
		     t.put(1, "soumya");
		     t.put(2, "latha");
		     t.put(3, "pavan");
		     t.put(4, "Arun");
		     t.put(5, "Padhma");
		   
		     System.out.println("Checking first key");
		      System.out.println("First key is: "+ t.firstKey());
	}

}
