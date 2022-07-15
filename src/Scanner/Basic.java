package Scanner;

import java.util.Scanner;
 
public class Basic {

	public static void main(String[] args) {
    
		System.out.print("please Enter your name:-");
	    
		Scanner in=new Scanner(System.in);
		String name=in.nextLine();
		System.out.println("Hello--"+name);
	}

}
