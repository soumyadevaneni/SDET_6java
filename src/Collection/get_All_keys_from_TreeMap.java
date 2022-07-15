package Collection;

import java.util.Set;
import java.util.TreeMap;

public class get_All_keys_from_TreeMap {

	public static void main(String[] args) {
    
		 TreeMap<Integer, String> t=new TreeMap<Integer,String >();
	        t.put(1, "s");
	        t.put(2, "o");
	        t.put(3, "u");
	        t.put(4, "m");
	        System.out.println("elements in treemap1:"+t);
	        System.out.println(t.keySet());
//	        Set<Integer>set=t.keySet();
//	          System.out.println("set:"+set+"\n");
//	          for(Integer key:set)
//	          {
//	        	  System.out.println(key);
//	}

}}
