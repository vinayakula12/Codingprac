
public class circulsum {

	public static void sumcir(int ar[]) {
		int sumtillnow =ar[0];
		int sumher=ar[0];
		int sum=ar[0];
		
		for(int i =1;i<ar.length;i++) {
			sumher=Math.min(sumher+ar[i], ar[i]);
			sumtillnow=Math.min(sumher, sumtillnow);
			sum=sum+ar[i];
		}
		
		System.out.println(sum-sumtillnow);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]={8, -8, 9, -9, 10, -11, 12};
sumcir(a);
	}

}
