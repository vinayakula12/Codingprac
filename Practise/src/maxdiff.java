
public class maxdiff {
public static void max(int ar[]) {
	int diff=0;
	for(int i=0;i<ar.length;i++) {
		int min=ar[0];
		
		if(ar[i]<min) {
			min =ar[i];
			
		}
		if(ar[i]-min>diff) {
			diff=ar[i]-min;
		}
		
	}
	System.out.println("the difference is "+diff);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int arr[] = {1, 2, 90, 170, 110};
		   max(arr);

	}

}
