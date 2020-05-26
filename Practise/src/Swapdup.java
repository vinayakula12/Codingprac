
public class Swapdup {
public static void swap(int ar[]) {
	int fir=-3;
	int sec=0;
	for(int i=1;i<ar.length;i++) {
		if(ar[i]<ar[i-1]) {
			if(fir==-3) {
				fir=ar[i-1];
			}
			
			sec=ar[i];
		}
	}
	System.out.println("two numbers are "+sec +" and "+fir);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 5, 3};
		swap(arr);

	}

}
