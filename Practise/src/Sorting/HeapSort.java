package Sorting;

import java.util.Arrays;

public class HeapSort {
	
	public static void heapsrt(int ar[]) {
		int n=ar.length;
		for(int i=(n-2)/2;i>=0;i--) {
			heapify(ar,n,i);
		}
			for(int j=n-1;j>0;j--) {
				int temp=ar[j];
				ar[j]=ar[0];
				ar[0]=temp;
				heapify(ar,j,0);
			}
		}
		
	

	private static void heapify(int[] ar, int n, int i) {
		// TODO Auto-generated method stub
		int largest=i;
		int l=2*i+1;
		int r=2*i+2;
		if(l<n &&ar[l]>ar[largest]) {
			largest = l; 
		}
		if(r<n &&ar[r]>ar[largest]) {
			largest = r; 
		}
		if(largest!=i) {
			int swap = ar[i]; 
            ar[i] = ar[largest]; 
            ar[largest] = swap; 
            
            heapify(ar,n,largest);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12, 11, 13, 5, 6, 7};
		System.out.print(Arrays.toString(arr));
		heapsrt(arr);
		System.out.println(" "); 
		System.out.println("Sorted array is"); 
		System.out.println(Arrays.toString(arr));

	}

}
