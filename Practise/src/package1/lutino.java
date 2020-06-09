package package1;

public class lutino {
	public static int lun(int ar[],int l,int h) {
		int i=0;
		int pivot=ar[h];
		for(int j=0;j<ar.length;j++) {
			if(ar[j]<pivot) {
				int temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
				
			}
			int temp=ar[i+1];
			ar[i+1]=ar[h];
			ar[h]=temp;
		}
		return (i+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
