package Collection;

import java.util.Collections;
import java.util.LinkedList;

public class Read_first_elementsfrom_linkedlist {

	public static void main(String[] args) {
  
    LinkedList<Integer>l=new LinkedList<Integer>();
    l.add(1);
    l.add(2);
    l.add(3);
    l.add(4);
    l.add(5);
      
    System.out.println(l.getFirst());
    System.out.println(l.getLast());
	}

}
