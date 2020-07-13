package BinarySearch;

public class Iterative {
	
	public static void iterse(int ar[],int k) {
		int h=ar.length-1;
		int l=0;
		
		while(l<=h) {
			int mid=l+(h-l)/2;
			
			if(ar[mid]==k) {
				System.out.println("Found element at "+mid);
				return;
			}
			
			else if(ar[mid]>k) {
				h=mid-1;
			}
			else {
				l=mid+1;
			}
			
		}
		
		System.out.println("not Found element at ");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 3, 4, 10, 40 }; 
		
		iterse(arr,17);

	}

}
