package GraphArraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class dfs {
	static boolean visited[]=new boolean[5];

	public static void dfstr(ArrayList<ArrayList<Integer>> hs,int s) {
		
		visited[s]=true;
		System.out.println(s);
		for(int j=0;j<hs.get(s).size();j++) {
			
		
			int f=hs.get(s).get(j);
			if(visited[f]==false) {
				visited[f]=true;
				dfstr(hs,f);
			
				
			}
		}}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
