package Collection;

import java.util.TreeMap;

public class Serach_Key_In_treemap {

	public static void main(String[] args) {
		 TreeMap<Integer, String> t=new TreeMap<Integer,String >();
	        t.put(1, "s");
	        t.put(2, "o");
	        t.put(3, "u");
	        t.put(4, "m");
	        System.out.println("elements in treemap1:"+t);
	        if(t.containsKey(3))
	        {
	        	System.out.println("The tree map contain key 3");
	        }
	        else {
	        	System.out.println("The Tree map does not contain key 3");
	        }
	}

}
