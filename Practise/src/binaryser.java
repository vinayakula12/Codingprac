
public class binaryser {
	
public static void bin(int ar[],int k) {
	int low=0;
	int high=ar.length-1;
	
	while(low<=high) {
		int mid = low+(high-low)/2;
	if(ar[mid]==k) {
		System.out.println("Found the element");
		return;
	}
	else if(k>ar[mid]) {
		low=mid+1;
	}
	else {
		high=mid-1;
	}
	}
	
	
}
public static int recurbin(int ar[],int k,int low,int high) {
	
	if(high>=low) {
		int mid=low+(high-low)/2;
	
	
	
	
	if(k==ar[mid]&& ar[mid-1]!=k) {
		System.out.println("found the element "+mid);
		return mid;
	}
	else if(k>ar[mid]) {
		return recurbin(ar,k,mid+1,high);
	}
	else {
		return recurbin(ar,k,low,mid-1);
	}
	
	}
	System.out.println("Not found the element");
	return-1;
}
public static int r1recurbin(int ar[],int k,int low,int high) {
	
	if(high>=low) {
		int mid=low+(high-low)/2;
	
	
	
	
	if(k==ar[mid]&& ar[mid+1]!=k) {
		System.out.println("found the element "+mid);
		return mid;
	}
	else if(k<ar[mid]) {
		
		return r1recurbin(ar,k,low,mid-1);
	}
	else {
		return r1recurbin(ar,k,mid+1,high);
	}
	
	}
	System.out.println("Not found the element");
	return-1;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2,1, 3,3,3, 4, 10, 40 }; 
		bin(arr,10);
		recurbin(arr,3,0,4);
		r1recurbin(arr,3,0,4);
		

	}

}
