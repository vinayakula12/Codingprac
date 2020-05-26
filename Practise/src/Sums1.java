import java.util.HashMap;

public class Sums1 {

	public static void sum3(int ar[], int k) {
		int sum=0;
		HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
		for(int i=0;i<ar.length;i++) {
			sum=sum+ar[i];
			
			hs.put(0, -1);
			if(hs.containsKey(sum-k)) {
				System.out.println("found the sum "+hs.get(sum-k)+" and "+i);
				return;
			}
			else {
				hs.put(sum, i);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {15, 2, 4, 8, 9, 5, 10, 23}; 
		//int n = arr.length; 
		int k = 23; 
		sum3(arr,k);

	}

}
