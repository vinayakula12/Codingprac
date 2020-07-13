package heap1;

public class heap1 {

	public static void heapify(int ar[],int i,int n) {
	int parent=(i-1)/2;
	int l=2*i+1;
	int r=2*i+1;
	int largest=i;
	
	
	if(l<n && ar[l]>ar[largest]) {
		largest=l;
	}
	
	
	if(r<n && ar[r]>ar[largest]) {
		largest=r;
	}
	
	if(largest!=i) {
		int temp= ar[largest];
		ar[largest]=ar[i];
		ar[i]=temp;
		heapify(ar,largest,n);
	}
	}
	public static void buildheap(int ar[]) {
		int n=ar.length;
		for(int i=(n-2)/2;i>=0;i--) {
			heapify(ar,i,n);
		}
	}
	public static void sort1(int ar[]) {
		int n=ar.length;
		for(int i=n-1;i>=0;i--) {
			int temp=ar[i];
			ar[i]=ar[0];
			ar[0]=temp;
			heapify(ar,0,i);
		}
	}
	
	static void printHeap(int arr[]) 

	{ 
		int n=arr.length;
	    System.out.println("Array representation of Heap is:"); 

	    for (int i = 0; i < n; ++i) 
	        System.out.print(arr[i] + " "); 

	    System.out.println(); 
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 3, 5, 4, 6, 13, 10, 
                9, 8, 15, 17 }; 
		buildheap(arr);
		sort1(arr);
		printHeap(arr);
	}

}
