package Array;

public class group_flips {

	public static void flip(int ar[]) {
		for(int i=0;i<ar.length-1;i++) {
			if(ar[i]!=ar[i+1] && ar[i+1]!=ar[0]) {
				System.out.println("The start is "+(i+1));
			}
			if(ar[i]!=ar[i+1] && ar[i+1]==ar[0]) {
				System.out.println("The end is "+i);
			}
			
		}
		if(ar[ar.length-1]!=ar[0]) {
			System.out.println("The end is "+(ar.length-1));
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0, 1, 1, 0, 0, 0, 1, 1}; 
		flip(arr);

	}

}
