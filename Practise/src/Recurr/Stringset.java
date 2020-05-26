package Recurr;

public class Stringset {
	
	public static void setstrng(String s,String curr,int index) {
		if(index==s.length() ) {
			System.out.println(curr);
			return;
		}
		setstrng(s,curr,index+1);
		setstrng(s,curr+s.charAt(index),index+1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setstrng("ABCD","",0);

	}

}
