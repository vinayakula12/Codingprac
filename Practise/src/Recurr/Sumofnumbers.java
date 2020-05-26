package Recurr;

public class Sumofnumbers {
	public static void sumnum(int k) {
		int sum=0;
		while(k>0) {
			sum=sum+(k%10);
			k=k/10;
			
		}
		System.out.println("sum is "+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sumnum(432);

	}

}
