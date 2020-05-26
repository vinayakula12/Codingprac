import java.util.HashMap;

public class distinct {

	public static  void disnct(int ar[]) {
		int count=0;
		HashMap<Integer,Integer> hs =new HashMap<Integer,Integer>();
		for(int i=0;i<ar.length;i++) {
			if(!hs.containsKey(ar[i])) {
				hs.put(ar[i], i);
				count++;
			}
			
		}
		System.out.println("the count is "+count);
		System.out.println("the counnjnnt is "+hs.size());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int arr[] = new int[]{15, 16, 27, 27, 28, 15};
		  disnct(arr);
		  
	}

}
