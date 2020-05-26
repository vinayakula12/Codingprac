package Tree;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree tr=new Tree();
		
		tr.root = new Node(1); 
        tr.root.left = new Node(2); 
        tr.root.right = new Node(3); 
        tr.root.left.left = new Node(4); 
        tr.root.left.right = new Node(5); 
Tree tr1=new Tree();
		
		tr1.root = new Node(10); 
        tr1.root.left = new Node(20); 
        tr1.root.right = new Node(30); 
        tr1.root.left.left = new Node(40); 
        tr1.root.left.right = new Node(50); 
        tr1.root.right.left = new Node(60); 
Tree tr2=new Tree();
		
		tr2.root = new Node(1); 
        tr2.root.left = new Node(2); 
        tr2.root.right = new Node(3); 
        tr2.root.left.left = new Node(4); 
        tr2.root.left.right = new Node(5); 
        ArrayList<Integer> hs = new ArrayList<Integer>();
        hs.add(4);
		/*System.out.println("Preorder traversal of binary tree is "); 
        tr.preorder(tr.root);
        System.out.println("\nPostorder traversal of binary tree is "); 
        tr.postorder(tr.root);
        
        System.out.println("\nInorder traversal of binary tree is "); 
        tr.inorder(tr.root);
        
        System.out.println("\nlevel traversal of binary tree is "); 
        tr.levelorder(tr.root);
        
        System.out.println("\nthe size is "+tr.sizetree(tr.root));
        System.out.println("\nthe height  is "+tr.heighttree(tr.root));
     
      tr.printlevel1(tr.root, 2);
      tr.leftview(tr.root, 1);
     System.out.println("the diam is "+tr.diam(tr.root)); */
     //System.out.println(tr.identical(tr.root,tr1.root));
        //tr.serlize(tr.root, hs);
        //tr1.printall(tr1.root, 3);
        //tr1.levelqueue(tr1.root);
        System.out.println(tr1.identic(tr1.root, tr2.root));
        
		

	}

}
