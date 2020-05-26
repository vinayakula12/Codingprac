import java.util.Arrays;

public class revgrps {

	public static void rev2(int ar[],int k) {
		int n=0;
		int m=0;
		int temp;
		for(int i=0;i<ar.length;i=i+k) {
			n=i;
			m=i+k-1;
		while(n<m) {
			 temp=ar[m];
			ar[m]=ar[i];
			ar[i]=temp;
			n++;
			m--;
		}
	}}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {1, 2, 3, 4, 5, 6, 7, 8,9}; 
	        int k = 3; 
	        rev2(arr,k);
	        System.out.println(Arrays.toString(arr));
	}

}
