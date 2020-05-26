
public class Peak {
public static int peak(int ar[],int low,int high) {
	if(low<=high) {
		int mid=(high+low)/2;
	
	if(ar[mid-1]<ar[mid] &&ar[mid]>ar[mid+1]) {
		return ar[mid];
	}
	if(ar[mid-1]>ar[mid]) {
		return peak(ar,low,mid-1);
	}
	if(ar[mid+1]>ar[mid]) {
		return peak(ar,mid+1,high);
}
	
	
	}
	return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int arr[] = {1, 3, 20, 4, 1, 0}; 
		   System.out.println(peak(arr,0,5));
	}

}
