package BinarySearch;

public class peak {
	// { Driver Code Starts
	
// Function to find the peak element
		// a[]: input array
		// n: size of array a[]
		public static int peakElement(int[] a,int n)
	    {
	       //add code here.
	       
	       int l=0;
	       int h=n-1;
	       int mid=(l+h)/2;
	       while(l<=h){
	           mid=(l+h)/2;
	       if(n==1){
	           return 0;
	       }
	       
	       else if((mid==0||a[mid-1]<a[mid]) && (mid==n-1 || a[mid]>a[mid+1])){
	           return mid;
	       }
	       else if(mid>0 && a[mid-1]>a[mid]){
	           h=mid-1;
	           
	       }
	       else{
	       l=mid+1;
	       }
	    }
	      return -1;  
	        
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] arr = {3,4}; 
		System.out.println(peakElement(arr,2));
	}

}
