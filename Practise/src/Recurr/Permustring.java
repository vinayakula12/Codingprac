package Recurr;

public class Permustring {
	

	public static void strngper(String curr,String str) {
		int n=str.length();
		if(n==0) {
			System.out.println(curr);
			}
		else {
		
		for(int i=0;i<n;i++) {
			strngper(curr+str.charAt(i),str.substring(0, i) + str.substring(i+1, n));
		}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		strngper("","ABC");
	}

}
