package package1;

public class revnum {
static int revnum1=0;
	public static void revnum(int k) {
		while(k>0) {
		
		int n=(k%10);
		revnum1=revnum1*10+n;
		k=k/10;
		}
		System.out.println(revnum1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		revnum(234);

	}

}
