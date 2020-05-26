import java.util.Arrays;

public class merge2so {
	
	public static int[] mertw(int ar1[],int ar2[]) {
		int n=ar1.length;
		int m=ar2.length;
		int ar3[]=new int[m+n];
		int i=0;
		int j=0;
		int k =0;
		
		while(i<n && j<m) {
			if(ar1[i]<ar2[j]) {
				ar3[k]=ar1[i];
				i++;
				k++;
			}
			else {
				ar3[k]=ar2[j];
				j++;
				k++;
			}
		}
		while(i<n) {
			ar3[k]=ar1[i];
			i++;
			k++;
		}
		while(j<m) {
			ar3[k]=ar1[j];
			j++;
			k++;
		}
		return ar3;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] arr1 = {1, 3, 5, 7}; 
	        
	      
	     int[] arr2 = {2, 4, 6, 8}; 
	        
	        
	          
	    
	     
	     System.out.println(Arrays.toString(mertw(arr1, arr2)));

	}

}
