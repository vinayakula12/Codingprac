
public class Primenum {

	public static void prime(int k) {
		for(int i=2;i<k;i++) {
			if(k%i==0) {
				System.out.println("not a prime");
				return;
			}
		}
		System.out.println("It is prime");
		return;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		prime(30);

	}

}
