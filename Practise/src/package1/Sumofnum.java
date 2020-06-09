package package1;

public class Sumofnum {
	static int sum=0;
public static void sumnum(int k) {
	while(k>0) {
	int n=(k%10);
	sum=sum+n;
	k=(k/10);
	}
	System.out.println(sum);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
sumnum(234);
	}

}
