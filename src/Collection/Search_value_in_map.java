package Collection;

import java.util.HashMap;
import java.util.Map;

public class Search_value_in_map {

	public static void main(String[] args) {
		  Map<Integer,String>map=new HashMap<Integer, String>();
          map.put(1, "Ammu");
          map.put(2, "Balu");
          map.put(3, "Cat");
          map.put(4,"Dog");
          System.out.println("elements in Map:"+map);
          if(map.containsValue("Ammu"))
          {
        	  System.out.println( " Ammu is there in map");
          }
          else {
        	  System.out.println("Ammu is not there in map");
          }
	}

}
