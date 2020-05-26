package Sorting;

public class Merge {
	public static void mergesort(int ar[],int low,int high) {
		if(low<high) {
		int mid=(low+high)/2;
		
		mergesort(ar,low,mid);
		mergesort(ar,mid+1,high);
		mergesort(ar,low,high);
		
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
