package Collection;


import java.util.*;

public class PriorityQueueCustomised {

	public static void main(String[] args) {
   
     PriorityQueue q=new PriorityQueue( new MyComparator());
     
        q.offer("A");
        q.offer("Z");
        q.offer("K");
        q.offer("L");
        
        System.out.println(q);
	}}


     class MyComparator implements Comparator
     {
    	 public int compare(Object ob1,Object ob2)
    	 {
    		 String s1=ob1.toString();
    		// String s2=(String)ob2;
    		 String s2=ob2.toString();
    		 return s2.compareTo(s1);
    	 }
      }
    
     
	


