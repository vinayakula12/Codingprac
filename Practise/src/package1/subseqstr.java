package package1;

public class subseqstr {

	public static void subseq(String s,char s1[], int i) {
		if(i==s.length()) {
			
			System.out.println(s1);
			return;
		}
		
		s1[i]='O';
		subseq(s,s1,i+1);
		s1[i]=s.charAt(i);
		subseq(s,s1,i+1);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="AB";
		char g[]=new char[s.length()];
		subseq(s,g,0);
	}

}
