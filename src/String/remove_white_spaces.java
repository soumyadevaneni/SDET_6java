package String;

public class remove_white_spaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String s="we   love   testing and Java";
   System.out.println("Before removing the white spaces:"+s);
  s= s.replaceAll(" ","" );
  System.out.println("After removing the white spaces:"+s);
	}

}
