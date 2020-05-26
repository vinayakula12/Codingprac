
public class max1 {

	public static void max1(int ar[]) {
		int count=0;
		int res=0;
		
		for(int i=0;i<ar.length;i++) {
		if(ar[i]==1){
			count++;
			if(res<count) {
				res=count;
			}
			
		}
		else {
			count=0;
		}
		
	}
		System.out.println(res);}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1};
		max1(arr);

	}

}
