package GraphArraylist;

import java.util.ArrayList;

public class Adjanecylist {
	public static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v) {
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
	public static void adjprint(ArrayList<ArrayList<Integer>> adj) {
		for(int i=0;i<adj.size();i++) {
			for(int j=0;j<adj.get(i).size();j++) {
				System.out.print(adj.get(i).get(j)+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int V=5;
		ArrayList<ArrayList<Integer>> adj1=new ArrayList<ArrayList<Integer>>(V);
		for(int i=0;i<V;i++) {
			adj1.add(new ArrayList<Integer>());
		}
		addEdge(adj1, 0, 1); 
        addEdge(adj1, 0, 4); 
        addEdge(adj1, 1, 2); 
        addEdge(adj1, 1, 3); 
        addEdge(adj1, 1, 4); 
        addEdge(adj1, 2, 3); 
        addEdge(adj1, 3, 4);
        adjprint(adj1);
		

	}

}
