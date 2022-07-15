package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayList_Serializable {

	public static void main(String[] args) {
     ArrayList l=new ArrayList();
     List l1=Collections.synchronizedList(l);
     l1.add("A");
     l1.add(1);
     l1.add("B");
     l1.add("2");
     System.out.println(l);
     synchronized(l1)
     {
         // must be in synchronized block
         Iterator it = l1.iterator();

         while (it.hasNext())
             System.out.println(it.next());
     }
     
     
	}

}
