package Recurr;

public class revsenum {
public static void revnum(int k) {
	int rev=0;
	int n=0;
	while(k>0) {
		n=k%10;
		rev=rev*10+n;
		k=k/10;
		
	}
	System.out.println("the reverse num is "+rev);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		revnum(432);

	}

}
