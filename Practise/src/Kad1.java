
public class Kad1 {
public static void kad1(int ar[]) {
	int sumtillnow =ar[0];
	int sumher=ar[0];
	
	for(int i =1;i<ar.length;i++) {
		sumher=Math.max(sumher+ar[i], ar[i]);
		sumtillnow=Math.max(sumher, sumtillnow);
	}
	System.out.println(sumtillnow);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] a = {-2, -3, 4, -1, -2, 1, 5, -3}; 
		 kad1(a);

	}

}
