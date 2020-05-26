import java.util.Arrays;

public class arrayre {

	public static int[] re12(int ar[]) {
		int ar1[]=new int[ar.length];
		boolean flag=true;
		int n=0;
		int m=ar.length-1;
		for(int i=0;i<ar.length;i++) {
			if(flag) {
				ar1[i]=ar[m];
				m--;
				
			}
			else {
				ar1[i]=ar[n];
				n++;
				
			}
			flag=!flag;
			
		}
		return ar1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int arr[] = new int[]{1, 2, 3, 4, 5, 6}; 
		 // re12(arr);
		  System.out.println(Arrays.toString(re12(arr)));

	}

}
