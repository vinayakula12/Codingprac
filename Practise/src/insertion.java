import java.util.Arrays;

public class insertion {

	public static void ins(int ar[]) {
		for(int i=1;i<ar.length;i++) {
			int peak=ar[i];
			int j=i-1;
			while(j>=0 && ar[j]>peak) {
				ar[j+1]=ar[j];
				j--;
			}
			ar[j+1]=peak;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = { 12, 11, 13, 5, 6 }; 
		ins(arr);
		
        System.out.println(Arrays.toString(arr));
	}

}
