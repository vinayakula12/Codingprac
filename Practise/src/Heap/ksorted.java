package Heap;

import java.util.PriorityQueue;

public class ksorted {
	public static void ksort(int ar[],int k) {
		PriorityQueue<Integer> hs=new PriorityQueue<Integer>();
		for(int i=0;i<k;i++) {
			hs.add(ar[i]);
		}
		for(int j=k;j<ar.length;j++) {
			System.out.print(hs.poll()+" ");
			hs.add(ar[j]);
		}
		while(!hs.isEmpty()) {
			System.out.print(hs.poll()+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int k = 3; 
	        int arr[] = { 2, 6, 3, 12, 56, 8 }; 
	        ksort(arr,k); 

	}

}
