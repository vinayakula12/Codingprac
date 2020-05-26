
public class leader {

	public static void leader(int ar[]) {
		int max=0;
		for(int i=ar.length-1;i>=0;i--) {
		if(ar[i]>max) {
			max=ar[i];
			System.out.print(max +" ");
		}
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int [] arr = {10, 750, 15, 60, 50,50}; 
		 leader(arr);

	}

}
