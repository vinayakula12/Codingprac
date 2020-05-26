import java.util.Arrays;

public class leftshift {

	public static void lefsh(int ar[]) {
		int f=ar[0];
		for(int i=0;i<ar.length-1;i++) {
			ar[i]=ar[i+1];
		}
		ar[ar.length-1]=f;
	}
	public static void dleftshift(int ar[],int d) {
		for(int i=0;i<d;i++) {
			lefsh(ar);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] arr = {10, 20, 30, 40, 50,50}; 
		// lefsh(arr);
		 //System.out.println(Arrays.toString(arr));
		 dleftshift(arr,3);
		 System.out.println(Arrays.toString(arr));
		 
		 

	}

}
