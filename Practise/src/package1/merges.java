package package1;

public class merges {

	public static void mer(int ar[],int l,int h) {
		while(l<h) {
			int mid=(l+h)/2;
			mer(ar,l,mid);
			mer(ar,mid+1,h);
			//merge(ar,l,h,mid);
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
