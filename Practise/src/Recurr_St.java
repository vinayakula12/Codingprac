
public class Recurr_St {
	public static int breakw(int n,int a,int b,int c) {
		
		if(n==0) {
			return 0;
		}
		if(n<0) {
			return -1;
		}
		int res=Math.max(Math.max(breakw(n-a,a,b,c), breakw(n-b,a,b,c)),breakw(n-c,a,b,c));
		if(res==-1) {
			return -1;
		}
		return res+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int n = 25;
	        int a = 11, b = 12, c = 13;
	        System.out.println(breakw(n, a, b, c));

	}

}
