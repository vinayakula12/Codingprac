package GraphArraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	public static void bfs(ArrayList<ArrayList<Integer>> hs,int v,int s) {
		boolean visited[]=new boolean[v];
		visited[s]=true;
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(s);
		while(!q.isEmpty()) {
			int a=q.poll();
			System.out.println(a);
			for(int j=0;j<hs.get(a).size();j++) {
				int f=hs.get(a).get(j);
				System.out.print(f+" ");
				if(visited[f]==false) {
					visited[f]=true;
					q.add(f);
				}
			}
		}
		
	}
//	public static void bfsdis(int v,ArrayList<ArrayList<Integer>> hs) {
//		for(int i=0;i<v;i++) {
//			if(visited[f]==false) {
//				bfs(ArrayList<ArrayList<Integer>> hs, v, f);
//			}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
