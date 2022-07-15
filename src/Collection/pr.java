package Collection;


import java.util.PriorityQueue;
import java.util.Queue;

public class pr {

	public static void main(String[] args) {
    
		PriorityQueue q=new PriorityQueue();
		    q.add("4");
		    q.add("6");
		    q.add("1");
		    q.add("3");
		    q.add("5");
		    q.add("7");
		 //  System.out.println(q.poll());
		   // System.out.println(q.peek());
		    System.out.println(q);

		    System.out.println("The removed elements are:");
		    while(!q.isEmpty()){
		    	
		    	System.out.println(q.poll());
		    }
		    System.out.println(q);
		    

		 
		
      
	}

}
