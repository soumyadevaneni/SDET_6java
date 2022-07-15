
package Collection;

import java.util.HashMap;
import java.util.Map;

public class get_entryset_from_hashmap {

	public static void main(String[] args) {

		  Map<Integer,String>map=new HashMap<Integer, String>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4,"D");
        System.out.println("elements in Map:"+map+"\n");
        
        System.out.println("Set View: " + map.entrySet());

	}

}
