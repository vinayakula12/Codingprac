
public class Subsumf {

	public static void sumf(int ar[],int k) {
		int sum=0;
		int max=0;
		for(int i=0;i<k;i++) {
			sum=sum+ar[i];
		}
		 max=sum;
		for(int j=0;j<ar.length-k;j++) {
			sum= sum+ar[j+k]-ar[j];
			max=Math.max(sum, max);
		}
		System.out.println(max);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 4, 2, 10, 2, 3, 1, 0, 20}; 
		int k = 4; 
		sumf(arr,k);

	}

}
