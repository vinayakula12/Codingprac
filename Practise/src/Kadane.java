
public class Kadane {

	
	public static int kad(int ar[]) {
		int maxnow=0;
		int maxsofar=0;
		//int sum=0;
		for(int i=0;i<ar.length;i++) {
			maxnow=Math.max(maxnow+ar[i], ar[i]);
			maxsofar=Math.max(maxnow, maxsofar);
			
		}
		return maxsofar;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] a = {-2, -3, 4, -1, -2, 1, 5, -3}; 
		 System.out.println(kad(a));

	}

}
