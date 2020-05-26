package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Tree {
Node root;
public  void preorder(Node h) {
	//Node h=root;
	
	if(h==null) {
		return;
	}
		System.out.print(h.data+" ");
		preorder(h.left);
		preorder(h.right);
	
}

public  void postorder(Node h) {
	//Node h=root;
	
	if(h==null) {
		return;
	}
		
	postorder(h.left);
	postorder(h.right);
		System.out.print(h.data+" ");
	
}

public  void inorder(Node h) {
	//Node h=root;
	
	if(h==null) {
		return;
	}
		
	inorder(h.left);
		System.out.print(h.data+" ");
		inorder(h.right);
		
	
}
public void levelorder(Node h) {
	Queue<Node> hs= new LinkedList<Node>();
	
	hs.add(h);
	
	while(!hs.isEmpty()) {
		Node temp=hs.poll();
		System.out.print(temp.data+" ");
		if(temp.left!=null) {
			hs.add(temp.left);
			
		}
		if(temp.right!=null) {
			hs.add(temp.right);
			
		}
		
	}
}
public int sizetree(Node h) {
	if(h==null) {
		return 0;
	}
	else {
		return 1+sizetree(h.left)+sizetree(h.right);
	}
	
	
	}
public int heighttree(Node h) {
	if(h==null) {
		return 0;
	}
	else {
		return 1+Math.max(heighttree(h.left), heighttree(h.right));
	}
}

public void printlevel1(Node h,int k) {
	
	
	if(h==null) {
		return;
	}
	else if(k==0){
		
		System.out.println("the level value is "+h.data);
		
		
		
		return;
	}
	else {
		printlevel1(h.left,k-1);
		printlevel1(h.right,k-1);
	}
}
int maxlevel=0;
public void leftview(Node h,int level) {
	
	if(h==null) {
		return;
	}
	if(maxlevel<level) {
		System.out.println("the left value is "+h.data);
		maxlevel=level;
		
	}
	leftview(h.left,level+1);
	leftview(h.right,level+1);
}
public int diam(Node h) {
	if(h==null) {
		return 0;
	}
	int d1=1+heighttree(h.left)+heighttree(h.right);
	int d2=  diam(h.left);
	int d3=diam(h.right);
	return Math.max(d1, Math.max(d2, d3));
}
public boolean identical(Node a,Node b) {
	if(a==null && b==null) {
		return true;
	}
	if(a.data==b.data && identical(a.left,b.left) && identical(a.right,b.right)) {
		return true;
	}
	return false;
	
}
public void serlize(Node h,ArrayList<Integer> hs) {
	if(h==null) {
		hs.add(-1);
		return;
	}
	hs.add(h.data);
	serlize(h.left,hs);
	serlize(h.right,hs);
}
 int index=0;
public Node deserlize(ArrayList<Integer> hs) {
	if(index==hs.size()) {
		
		return null;
	}
	int val=hs.get(index);
	index++;
	Node root=new Node(val);
	
	
	root.left=deserlize(hs);
	root.right=deserlize(hs);
	return root;
}
public void printall(Node h,int k) {
	for(int i=0;i<k;i++) {
		printlevel1(h,i);
	}
}

 
public void levelqueue(Node h) {
	Queue<Node> hs=new LinkedList<Node>();
	hs.add(h);
	int count=1;
	int res=0;
	while(!hs.isEmpty()) {
		
		 count=hs.size();
		 System.out.println(" ");
		 //System.out.println(" the count is "+count);
		 res=Math.max(res, count);
		for(int i=0;i<count;i++) {
			Node c=hs.poll();
		System.out.print(c.data+" ");
		if(c.left!=null) {
			hs.add(c.left);
		}
		
		if(c.right!=null) {
			hs.add(c.right);
		}
		}
	}
	System.out.println(" the max is "+res);
	}

public boolean identic(Node h1,Node h2 ) {
	if(h1==null && h2==null) {
		return true;
	}
	if(h1.data==h2.data && identic(h1.left,h2.left) && identic(h1.right,h2.right)) {
		return true;
	}
	return false;
	
}

}