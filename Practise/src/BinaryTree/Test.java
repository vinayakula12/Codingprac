package BinaryTree;

import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree tr =new Tree();
		tr.root=new Node(50);
		tr.root.left=new Node(40);
		tr.root.right=new Node (60);
		tr.root.left.left=new Node(30);
		tr.root.left.right=new Node(34);
		//tr.preorder(tr.root);
		tr.levelor(tr.root);
		tr.mirror(tr.root);
		tr.levelor(tr.root);
		//System.out.println(tr.sizetree(tr.root));
		//System.out.println(tr.heighttree(tr.root));
		//System.out.println(tr.maxtree(tr.root));
		//tr.printlevel(tr.root, 1);
		//tr.leftview(tr.root, 0);
		//System.out.println(tr.balan(tr.root));
		//tr.serialization(tr.root);
		//tr.search1(tr.root, 90);
		//System.out.println(tr.floor(tr.root, 55));
		//TreeMap<Integer,Integer> hs =new TreeMap<Integer,Integer>();
		//tr.sumbst(tr.root, 1900, hs);
		//tr.versum(tr.root);
		//tr.versumln(tr.root);
		
		

	}

	

}
