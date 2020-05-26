package BinarySearch;

public class Iterativebin {
public static void itebin(int ar[],int k) {
	int n=ar.length-1;
	int l=0;
	while(l<=n) {
		int mid=(l+n)/2;
		if(ar[mid]==k) {
			System.out.println("Found the element "+k);
			return;
		}
		else if(ar[mid]>k) {
			n=mid-1;
		}
		else {
			l=mid+1;
		}
	}
	System.out.println("no element found");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = { 2, 3, 4, 10, 40 }; 
		itebin(arr,50);

	}

}
