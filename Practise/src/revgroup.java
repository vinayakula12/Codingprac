import java.util.Arrays;

public class revgroup {

	
	public static void arrrev(int ar[],int k) {
		int n=ar.length;
		for(int i=0;i<n;i=i+k) {
			int l=i;
			int j=Math.min(i+k-1, n-1);
			//int j=i+k-1;
			while(l<j) {
				int temp=ar[l];
				ar[l]=ar[j];
				ar[j]=temp;
				l++;
				j--;
				
			}
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9,10,11};
		System.out.println(Arrays.toString(arr));
		arrrev(arr,3);
		System.out.println(Arrays.toString(arr));
		
		

	}

}
