import java.util.HashMap;

public class larconse {

	public static int sumt(int ar[]) {
		int res=0;
		
		HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
		for(int i=0;i<ar.length;i++) {
			hs.put(ar[i], i);
			
		}
		
		for(int j=0;j<ar.length;j++) {
			if(!hs.containsKey(ar[j]-1)) {
				int k=ar[j];
				int count=0;
				while(hs.containsKey(k)) {
					count++;
					k++;
					if(count>res) {
						res=count;
					}
				}
			}
		}
		return res;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] =  {1, 9, 3, 10, 4, 20, 2}; 
		System.out.println(sumt(arr));

	}

}
