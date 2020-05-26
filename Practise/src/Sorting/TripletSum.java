package Sorting;

import java.util.HashMap;

public class TripletSum {
	public static void tripletsum(int ar[],int sum) {
		HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
		int sum1=0;
		for(int i=0;i<ar.length-1;i++) {
			sum1=sum-ar[i];
			for(int j=1;j<ar.length;j++) {
				
				if(hs.containsKey(sum1-ar[j])) {
					System.out.println("found the sum "+ar[j]+" "+ar[i]+" "+ar[hs.get(sum1-ar[j])]);
					return;
				}
				else {
					hs.put(ar[j], j);
				}
				
			}
		}
		System.out.println("no sum found ");
		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int A[] = { 1, 4, 45, 6, 10, 8 };
		 tripletsum(A,50);

	}

}
