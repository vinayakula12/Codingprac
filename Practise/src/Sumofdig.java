
public class Sumofdig {

	public static int sumd(int n) {
		if(n<10) {
			return n;
		}
		else {
			return(sumd(n/10)+(n%10));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumd(376));

	}

}
