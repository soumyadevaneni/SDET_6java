package Numbers;

public class basic {

	public static void main(String[] args) {
    
		int num=541,rem;
		while(num>=9)
		{
			 int sum=0;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			sum=sum+rem;
			
		}
	
	  num=sum;
		}
		System.out.println(num);
	}
	

}
