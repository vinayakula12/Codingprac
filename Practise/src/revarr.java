import java.util.Arrays;

public class revarr {
	public static void rev1(int ar[]) {
		int n=0;
		int m =ar.length-1;
		while(n<m) {
			int temp=ar[n];
			ar[n]=ar[m];
			ar[m]=temp;
			n++;
			m--;
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int [] arr = {10, 20, 30, 40, 50}; 
	        rev1(arr);
	        System.out.println(Arrays.toString(arr));

	}

}
