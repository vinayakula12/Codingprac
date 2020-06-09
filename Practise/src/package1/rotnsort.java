package package1;

public class rotnsort {

	public static int pivot(int ar[],int l,int h) {
		int mid=(l+h)/2;
		if(ar[mid]>ar[mid+1]) {
			return mid;
		}
		if(ar[mid]<ar[mid-11]) {
			return (mid-1);
		}
		else if(ar[0]>ar[mid]) {
			return pivot(ar,l,mid-1);
		}
		else {
			return pivot(ar,mid+1,h);
		}
		
	}
	public static void searot (int ar[],int l,int h,int k) {
		int pivot=pivot(ar,l,h);
		if(ar[0]>k) {
			searot(ar,pivot,h,k);
		}
		else {
			searot(ar,l,pivot,k);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
