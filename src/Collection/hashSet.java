package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import java.util.List;

public class hashSet {

	public static void main(String[] args) {
    
		HashSet<Integer> ls=new HashSet<Integer>();
		ls.add(1);
		ls.add(2);
		ls.add(3);
		System.out.println(ls);
		ArrayList al=new ArrayList(ls);
		Collections.sort(al);;
		System.out.println(al);
	}

}
