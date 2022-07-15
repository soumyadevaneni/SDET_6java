package Collection;

import java.util.ArrayList;

public class peraParticularelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> list = new ArrayList<>(2);
         
	        list.add("A");
	        list.add("B");
	        list.add("C");
	        list.add("D");
	         
	        System.out.println( list.contains("A")  );       //true
	         
	        System.out.println( list.contains("Z") );     
	}

}
