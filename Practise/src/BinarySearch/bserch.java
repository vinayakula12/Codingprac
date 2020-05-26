package BinarySearch;

public class bserch {
public static void bsearch1(int ar[],int l,int h,int k) {
	int mid=(l+h)/2;
	if(l>h) {
		System.out.println("not element present");
		return;
	}
	else if(ar[mid]==k) {
		System.out.println("Found the element "+k); 
		return;
	}
	
	else if(ar[mid]>k) {
		bsearch1(ar,l,mid-1,k);
	}
	else {
		bsearch1(ar,mid+1,h,k);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = { 2, 3, 4, 10, 40 }; 
		int n=arr.length-1;
		bsearch1(arr,0,n,40);

	}

}
