package Collection;

import java.util.LinkedList;
import java.util.Queue;

public class Que {

	public static void main(String[] args) {
	
    Queue q=new LinkedList();
    q.add("b");
    q.offer("z");
    q.offer("m");
    q.offer("l");
    q.add("m");
    System.out.println(q.peek());
   // System.out.println("The removed element is:"+q.poll());
   // System.out.println(q.element());
    
    System.out.println(q);
    
    System.out.println("The removed elements are:");
    while(!q.isEmpty()){
    	
    	System.out.println(q.poll());
    }
    System.out.println(q);
    
	}
	

}
