package String;

import java.util.ArrayList;

public class permarr {

	
	    public ArrayList<ArrayList<Integer>> permute(int[] nums) {
	        ArrayList<ArrayList<Integer>> s= new ArrayList<>();
	         perm( s,nums,0, nums.length);
	        return s;
	        
	    }
	    public void perm( ArrayList<ArrayList<Integer>> s,int ar[],int l, int r){
	        
	        if(l==r){
	            ArrayList<Integer> s1= new ArrayList<Integer>();
	            for(int i=0;i<ar.length;i++){
	                s1.add(ar[i]);
	            }
	            
	            s.add(s1);
	            return;
	        }
	        
	        for(int i=l;i<r;i++){
	            swap(ar,l,i);
	            perm(s,ar,l+1,r);
	            swap(ar,l,i);
	        }
	        
	    }
	    private void swap(int[] nums, int i, int j) {
	        int temp = nums[i];
	        nums[i] = nums[j];
	        nums[j] = temp;
	    }
	    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
