package Tree2;

import Tree2.Node;
import Tree2.Tree;

public class Test {
	

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tree tree=new Tree();
		tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(7); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5);
        //tree.preorder(tree.root);
        //tree.levelorder(tree.root);
      // System.out.println("the height of the tree is "+tree.height(tree.root));
       //System.out.println("the size of the tree is "+tree.size(tree.root));
      // System.out.println("the max of the tree is "+tree.max(tree.root));
        tree.levelmax(tree.root);
       

	}

}
