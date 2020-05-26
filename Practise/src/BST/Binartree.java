package BST;

import BST.Node;

public class Binartree {
Node root;
public void insert(Node h,int k ) {
	Node newnode =new Node(k);
	if(h==null) {
		return;
	}
	if(k>h.data) {
		if(h.right==null) {
			h.right=newnode;
		}
		insert(h.right,k);
	}
	
	if(k<h.data) {
		if(h.left==null) {
			h.left=newnode;
		}
		insert(h.left,k);
	}
}


public void inorder(Node h) {
	
		if(h==null) {
			return;
		}
		
		inorder(h.left);
		System.out.print(h.data+" ");
		inorder(h.right);
		
	}
public Node delete(Node h,int x) {
	if(h==null) {
		return null;
	}
	if(h.data>x) {
		h.left=delete(h.left,x);
	}
	else if(h.data<x) {
		h.right=delete(h.right,x);
	}
	
	else {
		if(h.left==null) {
			return h.right;
		}
		
		else if(h.right==null) {
			return h.left;
		}
		else {
			Node succ= succ(h);
			h.data=succ.data;
			h.right=delete(succ,succ.data);
			
		}
	}
	return h;
}


private Node succ(Node h) {
	// TODO Auto-generated method stub
	Node curr=h.right;
	while(curr!=null && curr.left!=null) {
	curr=curr.left;
	}
	return curr;
}
}


