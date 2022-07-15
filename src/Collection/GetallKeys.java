package Collection;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GetallKeys {

	public static void main(String[] args) {
    
		  Map<Integer,String>map=new HashMap<Integer, String>();
          map.put(1, "A");
          map.put(2, "B");
          map.put(3, "C");
          map.put(4,"D");
          System.out.println("elements in Map:"+map);
          
          System.out.println("Set:"+map.keySet());
          System.out.println("set:"+map.values());
          
//          Set<Integer>set=map.keySet();
//          System.out.println("set:"+set);
//          for(Integer key:set)
//          {                                    
//        	  System.out.println(key);
//          }
        	}

	}