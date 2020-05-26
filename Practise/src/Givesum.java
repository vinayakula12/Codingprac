import java.util.HashMap;

public class Givesum {

	public static int sumar(int ar[],int sum) {
		int tsum=0;
		HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
		hs.put(0, -1);
		for(int i=0;i<ar.length;i++) {
			tsum=ar[i]+tsum;
			if(hs.containsKey(sum-tsum)) {
				System.out.println("found the sum "+hs.get(sum-tsum)+" and "+ i+" "+tsum+" "+sum);
				return 1;
			}
			else {
				hs.put(tsum, i);
			}
		}
		System.out.println("no sum found");
		return 0;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 2, -2, -20, 10}; 
        
        int sum = 0; 
        sumar(arr,sum);

	}

}
