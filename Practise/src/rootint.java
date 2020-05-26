
public class rootint {
	static int res;
public static int introot(int k,int low,int high) {
	 
	if(k==1||k==0) {
		return k;
	}
	
	if(low<=high) {
		int mid=(low+high)/2;
		
		if(mid*mid==k) {
			return mid;
		}
		else if(mid*mid<k) {
			 
			 res=mid;
			return introot(k,mid+1,high);
		}
		else {
			
			 return introot(k,low,mid-1);
			
		}
		
	}
	return res;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10; 
        System.out.println(introot(x,1,x)); 
	}

}
