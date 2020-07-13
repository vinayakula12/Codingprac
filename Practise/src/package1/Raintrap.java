package package1;

import java.util.Arrays;

public class Raintrap {

	public static int trap(int ar[]) {
		int arl[]=new int[ar.length];
		int arh[]=new int[ar.length];
		int sum=0;
		//arl[0]=ar[0];
		int lmax=ar[0];
		int rmax=ar[ar.length-1];
		for(int i=0;i<ar.length;i++) {
			lmax=Math.max(lmax, ar[i]);
			arl[i]=lmax;
		}
		for(int j=ar.length-1;j>=0;j--) {
			rmax=Math.max(rmax, ar[j]);
			arh[j]=rmax;
		}
		for(int i=0;i<ar.length;i++) {
			sum=sum+ Math.min(arl[i], arh[i])-ar[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 }; 
		System.out.println(trap(arr));
		

	}

}
