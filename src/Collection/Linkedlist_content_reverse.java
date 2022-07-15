package Collection;

import java.util.Collections;
import java.util.LinkedList;

public class Linkedlist_content_reverse {

	public static void main(String[] args) {

    LinkedList<Integer>l=new LinkedList<Integer>();
    l.add(1);
    l.add(2);
    l.add(3);
    l.add(4);
    
    Collections.reverse(l);
    System.out.println("Reverse:"+l);
	}

}
