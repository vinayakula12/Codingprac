
public class revsum {

	public static int sum1(int n) {
		int res=0;
		while(n>0) {
		res=res+(n%10);
		n=n/10;
		}
		return res;
	}
	
	public static int rev1(int n) {
		int res1=0;
		while(n>0) {
	res1=res1*10+(n%10);
	 n=n/10;
		}
	 return res1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(sum1(5));
		System.out.println(rev1(514));

	}

}
