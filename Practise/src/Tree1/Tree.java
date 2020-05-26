package Tree1;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

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

public  void inorder(Node h) {
	if(h==null) {
		return;
	}
	
	inorder(h.left);
	System.out.print(h.data+" ");
    inorder(h.right);
}
	
public void levelorder(Node h) {
	Queue<Node> hs=new LinkedList<Node>();
	hs.add(h);
	
	while(!hs.isEmpty()) {
		Node c=hs.poll();
		System.out.println(c.data);
		if(c.left!=null) {
			hs.add(c.left);
		}
		if(c.right!=null) {
			hs.add(c.right);
		}
		
	}
}

public int height(Node h) {
	if(h==null) {
		return 0;
	}
	if(height(h.left)>height(h.right)) {
		return height(h.left)+1;
	}
	else {
		return height(h.right)+1;
	}
}
public void klevel(Node h,int k) {
	if(h==null) {
		return;
	}
	if(k==0) {
		System.out.print(h.data+" ");
		return;
	}
	else {
		klevel(h.left,k-1);
		klevel(h.right,k-1);
	}
}
public int size(Node h) {
	
	if(h==null) {
		return 0;
	}
	
	return 1+size(h.left)+size(h.right);
	
}
int max=0;
public int max(Node h) {
	
	if(h==null) {
		return 0;
	}
	if(h.data>max) {
		max=h.data;
	}
	max(h.left);
	max(h.right);
	return max;
	
	
}
int mx=0;
public void rightprint(Node h,int level) {
	if(h==null) {
		return;
	}
	if(mx<level) {
		System.out.println(h.data);
		mx=level;
		
	}
	rightprint(h.right,level+1);
	rightprint(h.left,level+1);
}
public static void identical1(Node h,Node l) {
	if(h==null && l==null) {
		return;
	}
	
	else if(  (h==null && l!=null) ||(l==null && h!=null) ||(h.data!=l.data)) {
		System.out.println("not identical");
		return;
	}
	
	identical1(h.left,l.left);
	 identical1(h.right,l.right);
	
}
public static void verticalsum(Node h,int k,TreeMap<Integer,Integer> hs) {
	if(h==null) {
		return;
	}
	verticalsum(h.left,k-1,hs);
	if(hs.containsKey(k)) {
		//int presum=hs.get(k-1)+h.data;
		hs.put(k, hs.get(k)+h.data);
	}
	else {
		hs.put(k, h.data);
		//int presum=h.data;
	}
	
	verticalsum(h.right,k+1,hs);
}
public void VSUM(Node h) {
	TreeMap<Integer,Integer> hs=new TreeMap<Integer,Integer>();
	
	verticalsum(h,0,hs);
	//verticalsum(h,0,hs);
	for(Map.Entry<Integer, Integer> entry :hs.entrySet()) {
		System.out.println("Value is "+entry.getValue()+" Key is "+entry.getKey());
	}
	
}

public void VSUM1(Node h) {
	TreeMap<Integer,ArrayList<Integer>> hs=new TreeMap<Integer,ArrayList<Integer>>();
	
	verticaln(h,0,hs);
	//verticalsum(h,0,hs);
	for(Map.Entry<Integer, ArrayList<Integer>> entry :hs.entrySet()) {
		System.out.println("Value is "+entry.getValue()+" Key is "+entry.getKey());
	}
	
}
public void verticaln(Node h,int hd,TreeMap<Integer,ArrayList<Integer>> m) {
	if(h==null) {
		return;
	}
	if(m.containsKey(hd)) {
		ArrayList<Integer> k=m.get(hd);
		k.add(h.data);
		m.put(hd, k);
	}
	else {
		ArrayList<Integer> k=new ArrayList<Integer>();
		k.add(h.data);
		m.put(hd, k);
	}
	
	verticaln(h.left,hd-1,m);
	verticaln(h.right,hd+1,m);
}

}
