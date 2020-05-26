
public class equi {
public static void equi(int ar[]) {
	int lsum=0;
	int rsum=0;
	for(int i=0;i<ar.length;i++) {
		rsum=rsum+ar[i];
	}
	
	for(int j=0;j<ar.length;j++) {
		rsum=rsum-ar[j];
		if(lsum==rsum) {
		System.out.println("the equi point is "+ j);
		}
		lsum=lsum+ar[j];
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {-7, 1, 5, 2, -4, 3, 0};
		equi(A);
	}

}
