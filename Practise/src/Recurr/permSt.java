package Recurr;

public class permSt {

	public static void Permst(String  curr,String s) {
		int n=s.length();
		if(s.length()==0) {
			System.out.println(curr);
		}
		for(int i=0;i<s.length();i++) {
		Permst(curr+s.charAt(i),s.substring(0, i) + s.substring(i+1, n));
	}}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Permst("", "AB");

	}

}
