
public class pointersum {
public static void pointersum(int ar[],int sum) {
	int l=0;
	int h=ar.length-1;
	while(l<=h) {
	if(ar[l]+ar[h]==sum) {
		System.out.println("found the sum "+ar[l]+" and "+ar[h]);
		return;
	}
	else if(ar[l]+ar[h]>sum) {
		h--;
	}
	else {
		l++;
	}
}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[]{2, 3, 7, 8, 11};
		int sum = 15;
		
		pointersum(arr,sum);
	}

}
