package BST;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Binartree tree=new Binartree();
		tree.root=new Node(50);
		//tree.insert(tree.root, 30);
		tree.insert(tree.root, 30);
		tree.insert(tree.root, 20);
		tree.insert(tree.root, 40);
		tree.insert(tree.root, 70);
		tree.insert(tree.root, 60);
		tree.insert(tree.root, 80);
		
		tree.inorder(tree.root);
		//tree.delete(tree.root, 60);
		//System.out.println(" ");
		//tree.inorder(tree.root);
		
		

	}

}
