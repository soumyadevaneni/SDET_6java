package Collection;

import java.util.LinkedList;
import java.util.List;

public class sublistfrom_Linkedlist {

	public static void main(String[] args) {
      LinkedList<String>l=new LinkedList<String>();
      l.add("soumya");
      l.add("viyansh");
      l.add("latha");
      l.add("sri");
      l.add("ammu");
      System.out.println("The Linked list is:"+l);
      List  sub=l.subList(0, 3);
      
     System.out.println("The Sublist is:"+sub);
	}

}
