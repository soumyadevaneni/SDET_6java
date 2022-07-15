package Collection;


import java.util.TreeMap;

public class reverse_Sorted_key_tree_map {

	public static void main(String[] args) {
    
		  TreeMap<Integer, String> t=new TreeMap<Integer, String>();
		     t.put(1, "soumya");
		     t.put(2, "latha");
		     t.put(3, "pavan");
		     t.put(4, "Arun");
		     t.put(5, "Padhma");
		     System.out.println("Original tree content:"+t);
		     System.out.println("Reverse order view of the keys:"+t.descendingKeySet());
		     
	}

}
