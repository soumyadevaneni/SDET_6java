package Collection;

import java.util.TreeMap;

public class Search_Value_in_treemap {

	public static void main(String[] args) {
		 TreeMap<Integer, String> t=new TreeMap<Integer,String >();
	        t.put(1, "s");
	        t.put(2, "o");
	        t.put(3, "u");
	        t.put(4, "m");
	        System.out.println("elements in treemap1:"+t);
	        if(t.containsValue("u"))
	        {
	        	System.out.println("The tree map contain value is u");
	        }
	        else {
	        	System.out.println("the tree map does not contain value is u");
	        }
	}
}
