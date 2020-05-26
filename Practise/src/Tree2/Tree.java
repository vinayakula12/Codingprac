package Tree2;

import java.util.LinkedList;
import java.util.Queue;

import Tree2.Node;

public class Tree {
	Node root;
	public  void preorder(Node h) {
		if(h==null) {
			return;
		}
		System.out.print(h.data+" ");
		preorder(h.left);
		preorder(h.right);
		
	}
	public void levelorder(Node h) {
		Queue<Node> hs=new LinkedList<Node>();
		hs.add(h);
		while(!hs.isEmpty()){
			Node g=hs.poll();
			System.out.print(g.data+" ");
			if(g.left!=null) {
				hs.add(g.left);
			}
			
			if(g.right!=null) {
				hs.add(g.right);
			}
		}
	}
	
	public int height(Node h) {
		if(h==null) {
			return 0;
		}
		if(height(h.left)>height(h.right)) {
			return 1+height(h.left);
		}
		else {
			return 1+height(h.right);
		}
	}
	public int size(Node h) {
		if(h==null) {
			return 0;
		}
		return 1+size(h.left)+size(h.right);
	}
	int max=0;
	public  int max(Node h) {
		if(h==null) {
			return 0;
		}
		
	return Math.max(h.data, Math.max(max(h.left), max(h.right)));
	
}
int maxlevel=0;

	public void leftview(Node h, int level) {
		if(h==null) {
			return;
		}
		if(maxlevel<level) {
		System.out.println(h.data);
		maxlevel=level;
	}
		leftview(h.left,level+1);
		leftview(h.right,level+1);

}
	
public boolean childsum(Node h) {
	if(h==null) {
		return true;
	}
	return(h.data==h.left.data+h.right.data && childsum(h.left) && childsum(h.right));
	
}
public void levelmax(Node h) {
	Queue<Node> hs=new LinkedList<Node>();
	hs.add(h);
	while(!hs.isEmpty()){
		int n=hs.size();
		System.out.println(" ");
		for(int i=0;i<n;i++) {
			Node f=hs.poll();
			System.out.print(f.data+" ");
			
			if(f.left!=null) {
			hs.add(f.left);
			}
			if(f.right!=null) {
			hs.add(f.right);
			}
			
			}
		
	}
}



}