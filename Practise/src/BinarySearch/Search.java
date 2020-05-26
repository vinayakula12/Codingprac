package BinarySearch;

public class Search {

	public static void searc(int ar[],int k,int low,int high) {
		int mid=(high+low)/2;
		if(low>high) {
			System.out.println("not element present");
			return;
		}
		else if(ar[mid]==k) {
			System.out.println("found the  element "+mid+" "+k);
			return;
		}
		else if(ar[mid]>k) {
		searc(ar,k,low,mid-1);
		}
		else {
			searc(ar,k,mid+1,high);
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 3, 4, 10, 40 }; 
		int n=arr.length-1;
		searc(arr,46,0,n);
	}

}
