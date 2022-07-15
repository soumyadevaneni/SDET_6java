package Collection;

import java.util.ArrayList;
import java.util.List;

public class Copy_Arraylist_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Add elements to the list
      List<Integer>l=new ArrayList<Integer>();
      l.add(5);
      l.add(15);
      l.add(25);
      l.add(null);
      //convert Arraylist to Array
      Integer[] array=l.toArray(new Integer[0]);
      
      //print the array
      for(int i=0;i<array.length;i++)
      {
    	  System.out.print(array[i]+ " ");
      }
      
	}

}
