package BinarySearch;

public class rootbin {

	public static int rootbin(int k) {
		int l=1;
		int h=k;
		int res=0;
		if(k==1 || k==0) {
			return k;
		}
		
		while(l<=h) {
			int mid=(l+h)/2;
			if(mid*mid==k) {
				return mid;
			}
			else if(mid*mid<k) {
				l=mid+1;
				 res=mid;
			}
			else {
				h=mid-1;
			}
				
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("the root is "+rootbin(64));

	}

}
