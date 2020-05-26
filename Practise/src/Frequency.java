import java.util.HashMap;
import java.util.Map;

public class Frequency {

	public static void freq(int ar[]) {
		HashMap<Integer,Integer> hs =new HashMap<Integer,Integer>();
		for(int i=0;i<ar.length;i++) {
			if(hs.containsKey(ar[i])) {
				hs.put(ar[i], hs.get(ar[i])+1);
			}
			else {
				hs.put(ar[i], 1);
			}
		}
		
	for(Map.Entry<Integer,Integer> entry:hs.entrySet()){
		System.out.println("For the number "+entry.getKey()+" the frequency is "+entry.getValue());
	}
	hs.entrySet();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = new int[]{15, 16, 27, 27, 28, 15};
		 freq(arr);

	}

}
