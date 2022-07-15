  package Collection;

import java.util.HashMap;
import java.util.Map;

public class Delete_all_elements_from_HashMap {

	public static void main(String[] args) {
    
		  Map<Integer,String>map=new HashMap<Integer, String>();
	        map.put(1, "A");
	        map.put(2, "B");
	        map.put(3, "C");
	        map.put(4,"D");
	        System.out.println("before removing:"+map+map.size());
	        map.clear();
	        System.out.println("After removing:"+map +map.size());
	}

}
