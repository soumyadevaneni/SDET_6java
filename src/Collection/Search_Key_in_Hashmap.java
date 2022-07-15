package Collection;

import java.util.HashMap;
import java.util.Map;

public class Search_Key_in_Hashmap {

	public static void main(String[] args) {
     Map<Integer,String>map=new HashMap<Integer, String>();
            map.put(1, "A");
            map.put(2, "B");
            map.put(3, "C");
            map.put(4,"D");
            System.out.println("elements in Map:"+map);
            if(map.containsKey(1))
            
            {
            	System.out.println("Hurray 1 is there in map");
            }
            else
            {
            	System.out.println("1 is not there in map");
            }
            	}

}
