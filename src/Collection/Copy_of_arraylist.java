package Collection;

import java.util.ArrayList;

public class Copy_of_arraylist {

	public static void main(String[] args) {
		
	// create an array
  ArrayList<Integer>al=new ArrayList<Integer>();
    al.add(1);
    al.add(3);
    al.add(5);
    System.out.println("Arraylist:"+al);
    
    //create copy
    ArrayList<Integer>clonenumber= (ArrayList<Integer>)al.clone();
    System.out.println("cloned arraylist:"+clonenumber);
	}

}
