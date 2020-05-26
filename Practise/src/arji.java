
public class arji {
	
	public static void maxj(int ar[]) {
		int res=ar[1]-ar[0];
		int min=ar[0];
		for(int j=1;j<ar.length;j++) {
			res=Math.max(res, ar[j]-min);
			min=Math.min(min, ar[j]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
