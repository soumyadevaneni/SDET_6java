package Collection;

import java.util.SortedMap;
import java.util.TreeMap;

public class get_sorted_submap_from_Treemap {

	public static void main(String[] args) {
     TreeMap<Integer, String> t=new TreeMap<Integer, String>();
     t.put(1, "soumya");
     t.put(2, "latha");
     t.put(3, "pavan");
     t.put(4, "Arun");
     t.put(5, "Padhma");
     
     SortedMap<Integer, String>t2=t.subMap(2, 5);
     
      System.out.println("sortedmap:"+t2);
      t2=t.subMap(1, 4);
      System.out.println("sortedmap:"+t2);
      
      t2=t.subMap(0, 2);
      System.out.println("sortedmap:"+t2);

	}
	}


