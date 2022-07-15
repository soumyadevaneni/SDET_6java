package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class suffle_elements {

	public static void main(String[] args) {

     ArrayList<String>l=new ArrayList<String>();
     l.add("soumya");
     l.add("law");
     l.add("CA");
     l.add("FM");
     l.remove("law");
     l.add(null);
     System.out.println("Orginal list:"+l);
     Collections.shuffle(l);
     System.out.println("shuffled list:"+l);
	}

}
