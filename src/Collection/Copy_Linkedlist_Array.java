package Collection;

import java.util.LinkedList;

public class Copy_Linkedlist_Array {

	public static void main(String[] args) {
    
LinkedList<String>l=new LinkedList<String>();
    l.add("java");
    l.add("sql");
    l.add("manual");
    l.add("law");
    
    String[] s=l.toArray(new String[0]);
    for(int i=0;i<s.length;i++)
    {
    	System.out.print(s[i]+" ");
    }
	}

}
