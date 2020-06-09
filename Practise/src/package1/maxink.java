package package1;

public class maxink {

	public static void maxk(int ar[],int k) {
		int sum=0;
		int maxsum=0;
		for(int i=0;i<k;i++) {
			sum=sum+ar[i];
			maxsum=sum;
		}
		for(int j=k;j<ar.length;j++) {
			sum=sum+ar[j]-ar[j-k];
			maxsum=Math.max(maxsum, sum);
			
		}
		System.out.println("the max sum is "+maxsum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6};
				int k=3;
				maxk(arr,k);
				
	}

}
