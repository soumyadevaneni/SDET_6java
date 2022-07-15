package Arrays;

public class Primenum {

	public static void main(String[] args) {

		int a[]= {3,4,5,6,7,8,9,34,56,29};
		String prime=" ";
		for(int i=0;i<a.length;i++){
		int count=0;
		
		int num=a[i];
		for(int j=2;j<=num;j++) {
			if(num%j==0) {
				count++;
			}
		}
		if (count==1){
			prime=prime+" "+a[i];
		}
		
	}
		System.out.println(prime);

}}
