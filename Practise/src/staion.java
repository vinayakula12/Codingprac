
public class staion {

	public static int station(int ar1[],int ar2[]) {
		int n=ar1.length;
		int m=ar2.length;
		int i=0;
		int j=0;
		int plat=0;
		int res=0;
		while(i<n&& j<m){
		if(ar1[i]<=ar2[j]) {
			i++;
			plat++;
			if(plat>res) {
				res=plat;
			}
			
		}
		else {
			j++;
			plat--;
		}
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    int arr[] = {900, 940, 950, 1100, 1500, 1800}; 
	    int dep[] = {910, 1200, 1120, 1130, 1900, 2000}; 
	   System.out.println(station(arr,dep));

	}

}
