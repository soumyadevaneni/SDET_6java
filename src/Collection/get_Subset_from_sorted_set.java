package Collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class get_Subset_from_sorted_set {

	public static void main(String[] args) {
        SortedSet<Integer> s = new TreeSet<>();
       
          s.add(1);
          s.add(2);
          s.add(3);
          s.add(4);                    s.add(7);
          s.add(9);
          s.add(10);
          System.out.print("Elements range between 2 and 9 in set are : "
                  + s.subSet(2, 9));
	}

}
