package package1;

public class Searchlef {

	public static void lsearch(int ar[],int k,int l,int h) {
		int mid=(l+h)/2;
		if(ar[mid]==k && ar[mid-1]!=k) {
			System.out.println("the left index is "+mid+" "+ ar[mid]);
			return;
		}
		if(ar[mid]<k) {
			lsearch(ar,k,mid+1,h);
		}
		else {
			lsearch(ar,k,l,mid-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = { 0, 0, 1, 2, 5, 5, 6, 8, 8 }; 
		 lsearch(arr,2,0,8);
	}

}
