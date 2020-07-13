package String;

import java.util.ArrayList;


public class subarr {

	

	 public static ArrayList<ArrayList<Integer>> subsets(int[] nums) {
	          ArrayList<Integer> a=new ArrayList<Integer>();
	        for(int i=0;i<nums.length;i++){
	            a.add(nums[i]);
	        }
	        ArrayList<ArrayList<Integer>>  hs=new ArrayList<>();
	        
	        subseq( 0,nums,hs,a,new ArrayList<Integer>());
	        return hs;
	    }
	    public static void subseq(int x,int []nums,ArrayList<ArrayList<Integer>> hs,ArrayList<Integer> a, ArrayList<Integer> b){
	        if(x==nums.length){
	            
	            hs.add(new ArrayList<Integer>(b));
	            return;
	        }
	        
	        b.add(nums[x]); 
	        subseq(x+1,nums,hs,a,b);
	         
	        
	       
	        b.remove(b.size()-1); 
	        subseq(x+1,nums,hs,a,b);
	        
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3};
		System.out.println(subsets(arr));
	}
	

}
