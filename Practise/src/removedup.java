import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class removedup {
public static void remdup(int ar[]) {
	HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
	for(int i=0;i<ar.length;i++) {
		if(!hs.containsKey(ar[i])) {
			hs.put(ar[i], i);
		}
		
	}
	for(Entry<Integer, Integer> entry:hs.entrySet()){
		System.out.print(entry.getKey()+" ");
		
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] arr = {10, 20, 30, 40, 50,50}; 
		 remdup(arr);

	}

}
