package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Swap_two_element {

	public static void main(String[] args) {
    ArrayList<Integer>l=new ArrayList<Integer>();
    l.add(1);
    l.add(2);
    l.add(3);
    l.add(4);
    l.add(5);
    l.add(6);
    
    //Before swap
    System.out.println("Before swap the ArrayList:"+l);
    
    //Swap the elements
    Collections.swap(l, 0, 5);
    //after swap the element
    System.out.println("After swap the ArrayList:"+l);
	}

}
