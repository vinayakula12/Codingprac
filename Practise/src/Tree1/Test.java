package Tree1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree tree=new Tree();
		tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6); 
        tree.root.right.right = new Node(7); 
        
        //Tree tree1=new Tree();
		//tree1.root = new Node(1); 
        //tree1.root.left = new Node(2); 
       // tree1.root.right = new Node(3); 
       // tree1.root.left.left = new Node(4); 
       // tree1.root.left.right = new Node(5);
        //tree.preorder(tree.root);
        //tree.levelorder(tree.root);
       //System.out.println(tree.height(tree.root));
       //tree.klevel(tree.root, 1);
       //System.out.println(tree.size(tree.root));
       //System.out.println(tree.max(tree.root));
       //tree.rightprint(tree.root, 1);
     //tree.inorder(tree.root);
     //System.out.println(" ");
     //tree.preorder(tree.root);
   //  tree.VSUM(tree.root);
     tree.VSUM1(tree.root);

	}

	

}
