package Hash;

import java.util.HashMap;

public class Subarsum {

	
	public static void subsum(int ar[], int k) {
		int sum=0;
		HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
		hs.put(0, -1);
		for(int i=0;i<ar.length;i++) {
			sum=sum+ar[i];
			
			if(hs.containsKey(sum-k)) {
				System.out.println("the sum exists at "+i+" and  "+hs.get(sum-k)+" at "+k);
				return;
			}
			else {
				hs.put(sum, i);
			}
		}
		System.out.println("no sum found ");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 4, 20, 3, 10, 5};
		subsum(arr,37);
		

	}

}
