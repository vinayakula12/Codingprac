package BinarySearch;

public class Firsoccurance {
	
	public static void fiocearch1(int ar[],int l,int h,int k) {
		int mid=(l+h)/2;
		if(l>h) {
			System.out.println("not element present");
			return ;
		}
		else if(ar[mid]==k &&( mid==0 ||ar[mid-1] !=k)) {
			System.out.println("Found the element "+mid); 
			return ;
		}
		
		else if(ar[mid]>=k) {
			fiocearch1(ar,l,mid-1,k);
		}
		else {
			fiocearch1(ar,mid+1,h,k);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = { 2, 3,3,3, 4, 10, 40 }; 
		int n=arr.length-1;
		fiocearch1(arr,0,n,4);


	}

}
