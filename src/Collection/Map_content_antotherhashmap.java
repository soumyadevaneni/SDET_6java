package Collection;

import java.util.HashMap;

public class Map_content_antotherhashmap {

	public static void main(String[] args) {
    HashMap<String, String> hp=new HashMap<String, String>();
    hp.put("101", "soumya");
    hp.put("102", "latha");
    hp.put("103","viyansh");
    System.out.println(hp);
    
    HashMap<String, String>hp1=new HashMap<String, String>();
    hp1.put("10", "durga");
    hp1.put("11", "raju");
    hp.putAll(hp1);
    System.out.println(hp);
	}

}
