package Recurr;

public class rev {
	public static int rev1(int k) {
		if(k<10) {
			return k;
		}
		return rev1(k/10)+k%10;
	}
	static int res=0;
	public static int rev2(int k) {
		while(k>0) {
			res=res*10+k%10;
			k=k/10;
		}
		return res;
		
				
				
				
				
				
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(rev1(334));
		System.out.println(rev2(342));

	}

}
