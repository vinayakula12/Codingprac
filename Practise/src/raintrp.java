import java.util.Arrays;

public class raintrp {
public static void rain(int ar[]) {
	int min=0;
	int max=0;
	int fill=0;
	int arl[]=new int[ar.length];
	int arh[]=new int[ar.length];
	min=ar[0];
	arl[0]=min;
	int rmax=ar[ar.length-1];
	arh[ar.length-1]=ar[ar.length-1];
	
	for(int i=1;i<ar.length;i++){
			if(ar[i]<min) {
				arl[i]=min;
				continue;
			}
	       arl[i]=ar[i];
	       min=ar[i];
			}
	//System.out.println(Arrays.toString(arl));
	for(int i=ar.length-2;i>=0;i--) {
		if(ar[i]>rmax) {
			rmax=ar[i];
			arh[i]=rmax;
			continue;
		}
		arh[i]=rmax;
		
	}
	//System.out.println(Arrays.toString(arh));
	for(int i=0;i<ar.length;i++) {
		fill=fill+(Math.min(arl[i], arh[i])-ar[i]);
	}
	System.out.println(fill);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 }; 
		rain(arr);
		

	}

}
