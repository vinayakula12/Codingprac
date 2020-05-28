package String;

public class SubseqString {

	public static void subseq(String s,char subset[],int i) {
		if(i==s.length()) {
			
			System.out.println(subset);
			return;
		}
		
		subset[i]='O';
		subseq(s,subset,i+1);
		subset[i]=s.charAt(i);
		subseq(s,subset,i+1);
		

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ABC";
		char subset[]=new char[s.length()];
	
		subseq(s,subset,0);
		

	}

}
