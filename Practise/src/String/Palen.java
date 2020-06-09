package String;

public class Palen {
	public static void palen(String s) {
		char s1[]=s.toCharArray();
		int n=s1.length-1;
		int l=0;
		while(l<n) {
			if(s1[n]==s1[l]) {
				l++;
				n--;
			}
			else {
				System.out.println("it is not palen");
				return;
			}
			
		}
		System.out.println("it is a palendrome");
		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		palen("navaffn");

	}

}
