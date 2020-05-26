
public class Prime {
	public static boolean prime(int k) {
		for(int i=2;i<k;i++) {
			if(k%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(prime(8));
	}

}
