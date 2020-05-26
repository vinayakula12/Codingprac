package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class Tree {
Node root;
public void preorder(Node h) {
	if(h==null) {
		return;
	}
	
	System.out.print(h.data+" ");
	preorder(h.left);
	preorder(h.right);
}

public void levelor(Node h) {
	int max=0;
	Queue<Node> hs=new LinkedList<Node>();
	hs.add(h);
	while(!hs.isEmpty()) {
		int count =hs.size();
		
		
		 max=Math.max(count, max);
		for(int i=0;i<count;i++) {
			Node g=hs.poll();
			System.out.print(g.data+" ");
		if(g.left!=null) {
			hs.add(g.left);
		}
		if(g.right!=null) {
			hs.add(g.right);
		}
	}}
	System.out.println(" the max width is "+max);
}
public int sizetree(Node h) {
	if(h==null) {
		return 0;
	}
	return(sizetree(h.left)+sizetree(h.right)+1);
}
public int heighttree(Node h) {
	if(h==null) {
		return 0;
	}
	if(heighttree(h.left)>heighttree(h.right)) {
		return heighttree(h.left)+1;
	}
	else {
		return heighttree(h.right)+1;
	}
}
public int maxtree(Node h) {
	if(h==null) {
		return 0;
	}
	return Math.max(h.data, Math.max(maxtree(h.left), maxtree(h.right)));
	
}

public void printlevel(Node h,int level) {
	if(h==null) {
		return;
	}
	else if(level==0) {
		System.out.print(h.data+" ");
	}
	else {
		printlevel(h.left,level-1);
		printlevel(h.right,level-1);
	}
}
int viewlevel=-1;

public void leftview(Node h,int level) {
	if(h==null) {
		return;
	}
	if(viewlevel<level) {
		System.out.println(h.data);
		viewlevel=level;
	}
	leftview(h.left,level+1);
	leftview(h.right,level+1);
}

public boolean balan(Node h) {
	if(h==null) {
		return true;
	}
	int hl=heighttree(h.left);
	int hr=heighttree(h.right);
return(Math.abs(hl-hr)<=1 && balan(h.left)  && balan(h.right));
	
}
public void serialization(Node h) {
	if(h==null) {
		System.out.print("-1 ");
		return;
	}
	System.out.print(h.data+" ");
	serialization(h.left);
	serialization(h.right);
}
int id=0;
public Node deserilization(ArrayList<Integer> hs) {
	
	if(id==hs.size()) {
		return null;
	}
	int val=hs.get(id);
	id++;
	if(val==-1) {
		return null;
		
	}
	Node root=new Node(val);
	root.left=deserilization(hs);
	root.right=deserilization(hs);
	return root;
	
}

public void search1(Node h,int k) {
	
	if(h==null) {
		System.out.println("Not found the value ");
		return;
	}
		
		if(h.data==k) {
	
		System.out.println("found the value "+k);
		return;
	}
	 if(h.data>k) {
		search1(h.left,k);
	}
	else {
		search1(h.right,k);
	}
}
public Node insert1(Node h,int k) {
	Node newnode=new Node(k);
	if(h==null) {
		return newnode;
	}
	if(h.data>k) {
		
		h.left=insert1(h.left,k);
	}
	else {
		h.right=insert1(h.right,k);
	}
	return h;
}
public Node delete1(Node h,int k) {
	if(h==null) {
		return null;
	}
	if(k<h.data) {
		h.left=delete1(h.left,k);
	}
	else if(k>h.data) {
		h.right=delete1(h.right,k);
	}
	else {
		if(h.left==null) {
			return h.right;
		}
		else if(h.right==null) {
			return h.left;
		}
		else {
			Node t=succ(h);
			h.data=t.data;
			t.right=delete1(t.right,k);
		}
	}
	return h;
}

private Node succ(Node h) {
	// TODO Auto-generated method stub
	Node r=h.right;
	if(r!=null &&r.left!=null) {
		r=r.left;
	}
	return r;
}
int res=0;
public int floor(Node h,int k) {
	if(h==null) {
		return 0;
	}
	if(h.data<=k) {
		return Math.max( h.data, Math.max(floor(h.left,k), floor(h.right,k)));
	}
	return -1;
	
	 
}
public void sumbst(Node h,int sum,TreeMap<Integer,Integer> hs) {
	
	if(h==null) {
		return;
	}
	if(hs.containsKey(sum-h.data)) {
		System.out.println("Found the sum "+h.data+" "+hs.get(sum-h.data));
		return;
	}
	else {
		hs.put(h.data, 1);
	}
	sumbst(h.left,sum,hs);
	sumbst(h.right,sum,hs);
	
	
}
public void sumverti(Node h,int k,TreeMap<Integer,Integer> hs) {
	if(h==null) {
		return;
	}
	if(hs.containsKey(k)) {
		int j=hs.get(k)+h.data;
		hs.put(k, j);
		
	}
	else {
		hs.put(k, h.data);
	}
	sumverti(h.left,k-1,hs);
	sumverti(h.right,k+1,hs);
	
}
public void versum(Node h) {
	TreeMap<Integer,Integer> hs =new TreeMap<Integer,Integer>();
	
	sumverti(h,0,hs);
	for(Map.Entry<Integer,Integer> entry:hs.entrySet()) {
		System.out.println("the key is "+entry.getKey()+" the value is "+entry.getValue());
	}
}

public void sumvertiln(Node h,int k,TreeMap<Integer,ArrayList<Integer>> hs) {
	if(h==null) {
		return;
	}
	if(hs.containsKey(k)) {
		ArrayList<Integer> j=hs.get(k);
		j.add(h.data);
		hs.put(k, j);
		
	}
	else {
		ArrayList<Integer> j1=new ArrayList<Integer>();
		j1.add(h.data);
		hs.put(k, j1);
	}
	sumvertiln(h.left,k-1,hs);
	sumvertiln(h.right,k+1,hs);
	
}
public void versumln(Node h) {
	TreeMap<Integer,ArrayList<Integer>> hs =new TreeMap<Integer,ArrayList<Integer>>();
	
	sumvertiln(h,0,hs);
	for(Map.Entry<Integer,ArrayList<Integer>> entry:hs.entrySet()) {
		System.out.println("the key is "+entry.getKey()+" the value is "+entry.getValue());
	}
}
public void mirror(Node h) {
	if(h==null) {
		return;
	}
	mirror(h.left);
	mirror(h.right);
	Node temp=h.left;
	h.left=h.right;
	h.right=temp;
}

}
