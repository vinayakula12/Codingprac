package package1;

public class Permstring {
	
	public static void permstrng(String s1, String s2) {
		int n=s2.length();
		if(s2.length()==0) {
			System.out.println(s1);
		}
		for(int i=0;i<n;i++) {
			
			permstrng(s1 + s2.charAt(i), s2.substring(0, i) + s2.substring(i+1, n));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permstrng("","ABC");
	}

}
