import java.util.HashMap;

public class Sumtwo {

	public static int sumtw(int ar[],int sum) {
		HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
		for(int i=0;i<ar.length;i++) {
			int h=ar[i];
			if(hs.containsKey(sum-h)) {
				System.out.println("contains sum");
				return 1;
			}
			
			else {
				hs.put(ar[i], i);
			}
		}
		System.out.println("no sum exist");
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = new int[]{3, 8, 4, 7, 6, 1};
		 int x = 94;
		 sumtw(arr,x);
	}

}
