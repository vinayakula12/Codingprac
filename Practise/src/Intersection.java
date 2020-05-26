import java.util.HashMap;

public class Intersection {

	public static void inter(int ar1[],int ar2[]) {
		int res=0;
		HashMap<Integer,Integer> hs =new HashMap<Integer,Integer>();
		for(int i=0;i<ar1.length;i++) {
			if(!hs.containsKey(ar1[i])) {
				hs.put(ar1[i], i);
			}
		}
		
		for(int j=0;j<ar2.length;j++) {
			if(hs.containsKey(ar2[j])) {
				res++;
				hs.remove(ar2[j]);
			}
		}
		System.out.println("the intersection is "+res);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr1[] = new int[]{15, 17, 27, 27, 28, 15};
		 
	        int arr2[] = new int[]{16, 17, 28, 17, 31, 17};
inter(arr1,arr2);
	}

}
