package package1;

public class Kadan {
public static void kad(int ar[]) {
	int maxsofar=0;
	int maxnow=0;
	
	for(int i=0;i<ar.length;i++) {
		
		maxnow=Math.max(maxnow+ar[i], ar[i]);
		if(maxnow>maxsofar) {
			maxsofar=maxnow;
		}
		
		
	}
	System.out.println(maxsofar);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {-2, -3, 4, -1, -2, 1, 5, -3}; 
		kad(a);
	}

}
