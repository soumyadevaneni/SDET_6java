package Collection;

import java.util.ArrayList;
import java.util.List;


public class Find_Arraylist_contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

   ArrayList<String>list=new ArrayList<String>();
       list.add("Java");
       list.add("Python");                                          
       list.add("selenium");
     
     List<String>l=new ArrayList<String>(); 
     l.add("Python");
     l.add("selenium");

  

     System.out.println("ArrayList 1 contains all elements of ArrayList 2: " + list.containsAll(l));
     
     l.add("taxation");
     System.out.println("ArrayList 2 contains all elements of ArrayList 1: " +l.containsAll(list));
     
     
     
	}
	}


