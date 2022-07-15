package Collection;


import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Linkedlist_Iterator_reverseorder {

	public static void main(String[] args) {
List l=new LinkedList();
		/*
		 * LinkedList<Integer>l=new LinkedList<Integer>();
		 */		    l.add(1);
		    l.add(2);
		    l.add(3);
		    l.add(4);
		    l.add(5);
		 
		ListIterator i=l.listIterator(l.size());
		System.out.println("reverse: ");
		while(i.hasPrevious()) {
		System.out.println(i.previous());
		 
		  
	}}

}
