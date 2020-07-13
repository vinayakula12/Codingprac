package BinarySearch;

public class RECURSER {

	public static void recur(int ar[],int k,int l,int h) {
		int mid=l+(h-l)/2;
		if(l>h) {
			System.out.println("no element found");
			return;
		}
		else if(ar[mid]==k) {
			
			System.out.println(" element found "+mid);
			return;
		}
		else if(ar[mid]>k) {
			 recur(ar,k,l,mid-1);
		}
		else {
			 recur(ar,k,mid+1,h);
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 3, 4, 10, 40 }; 
		recur(arr,11,0,4);
	}

}
