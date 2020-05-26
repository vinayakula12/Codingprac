
public class Recurr_Print {
	
	public void print(int n) {
		if(n==1) {
			System.out.print(n);
		}
		else {
			System.out.print(n+" ");
			print(n-1);
			}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Recurr_Print hs=new Recurr_Print();
		hs.print(5);
		
	}

}
