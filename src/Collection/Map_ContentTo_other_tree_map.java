package Collection;

import java.util.Map;
import java.util.TreeMap;

public class Map_ContentTo_other_tree_map {

	public static void main(String[] args) {
    
      TreeMap<Integer, String> t=new TreeMap<Integer,String >();
        t.put(1, "s");
        t.put(2, "o");
        t.put(3, "u");
        t.put(4, "m");
        System.out.println("elements in treemap1:"+t);
        
        TreeMap<Integer, String>t1=new TreeMap<Integer, String>();
        t1.put(5, "y");
        t1.put(6, "l");
        t1.put(7, "a");
        System.out.println("elements in treemap2:"+t1);
        
        //After copy one map to another map
        t.putAll(t1);
        System.out.println("After cop map1 to map2:"+t);
	}

}
