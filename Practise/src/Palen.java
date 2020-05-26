
public class Palen {
	public static void palen(String s) {
		char s1[]=s.toCharArray();
		int n=0;
		int m=s1.length-1;
		while(n<m) {
			if(s1[n]==s1[m]) {
				n++;
				m--;
			}
			else {
				System.out.println("it is not a palendrome");
				return;
			}
			
		}
		System.out.println("it is a palendrome");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		palen("nivihn");
		

	}

}
