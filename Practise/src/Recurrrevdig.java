
public class Recurrrevdig {

	public static int rev(int n) {
		int b=1;
	if(n<10) {
		return n;
	}
	b=b*10;
		return (n%10)*b+rev(n/10);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(rev(251));
	}

}