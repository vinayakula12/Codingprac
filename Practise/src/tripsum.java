import java.util.HashMap;

public class tripsum {

	public static void tripsum(int ar[], int sum) {
		HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
		int curr_sum=0;
		for(int i=0;i<ar.length-2;i++) {
			curr_sum=sum-ar[i];
			for(int j=1;j<ar.length;j++) {
				if(hs.containsKey(curr_sum-ar[j])) {
					System.out.println("found sum at "+ar[i]+" "+ar[j]+" "+(curr_sum-ar[j]));
				}
				hs.put(ar[j], j);
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = { 1, 4, 45, 6, 10, 8 }; 
        int sum = 22;
        tripsum(A,sum);
	}

}
