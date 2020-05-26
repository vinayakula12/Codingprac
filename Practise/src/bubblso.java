import java.util.Arrays;

public class bubblso {
public static void sorb(int ar[]) {
	for(int i=0;i<ar.length;i++) {
		for(int j=0;j<ar.length-i-1;j++) {
			if(ar[j]>ar[j+1]) {
				int temp = ar[j]; 
                ar[j] = ar[j+1]; 
                ar[j+1] = temp; 
			}
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int arr[] = {64, 34, 25, 12, 22, 11, 90};
		  sorb(arr);
		  System.out.println(Arrays.toString(arr));

	}

}
