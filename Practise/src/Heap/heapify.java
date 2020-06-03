package Heap;

public class heapify {
public static void heapify(int ar[],int n,int i) {
	//int n=ar.length;
	int parent=(i-1)/2;
	int l=2*i+1;
	int r=2*i+2;
	int largest=i;
	
	if(l<n &&ar[l]>ar[largest]) {
		largest=l;
	}
	if(r<n &&ar[r]>ar[largest]) {
		largest=r;
	}
	if(largest!=i) {
		int temp=ar[i];
		ar[i]=ar[largest];
		ar[largest]=temp;
	
	
	heapify( ar,n,largest);
	}
	
}
public static void buildheap(int ar1[]) {
	int n=ar1.length;
	for(int i=(n-2)/2;i>=0;i--) {
		heapify(ar1,n,i);
	}
}
public static void sorth(int arr[]) {
	int n=arr.length;
	for(int i=n-1;i>=0;i--) {
		int temp=arr[0];
		arr[0]=arr[i];
		arr[i]=temp;
		heapify(arr,i,0);
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
		sorth(arr);
		printHeap(arr);
		

	}

}
