
public class Leaders {
static int max=0;
	public static void leader(int ar[]) {
		for(int i=ar.length-1;i>=0;i--) {
			if(ar[i]>max) {
				max=ar[i];
				System.out.print(max+" ");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = new int[]{16, 17, 4, 3, 5, 2}; 
		 leader(arr);

	}

}
