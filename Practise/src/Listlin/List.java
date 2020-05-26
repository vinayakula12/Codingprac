package Listlin;

import java.util.HashMap;

public class List {
	
		Node head;
		public void addnode(int data) {
			Node newnode=new Node(data);
			newnode.next=head;
			head=newnode;
		}
		public void printnode(Node head) {
			Node x=head;
			while(x!=null) {
				System.out.print(x.data+" ");
				x=x.next;
			}
		}
		public void addatend(int data) {
			Node newnode=new Node(data);
			Node x=head;
			while(x.next!=null) {
				x=x.next;
			}
			x.next=newnode;
			
		}
		public int findmid(Node head) {
			Node x=head;
			Node b =head;
			while(x.next!=null) {
				x=x.next.next;
				b=b.next;
			}
			return b.data;
			
			}
		public int nthfromend(Node head,int k) {
			Node x=head;
			Node b =head;
			int count=1;
			while(count<k) {
				count++;
				x=x.next;
			}
			while(x.next!=null) {
				x=x.next;
				b=b.next;
			}
			return b.data;
			
		}
		public Node reverselink(Node head) {
			Node curr=head;
			Node prev=null;
			Node next=null;
			while(curr!=null){
				next=curr.next;
				curr.next=prev;
				prev=curr;
				curr=next;
			}
			return prev;
		}
		public int removeloop(Node head) {
			HashMap<Node,Integer> hs=new HashMap<Node,Integer>();
			Node h=head;
			Node prev=null;
			while(h.next!=null) {
				if(hs.containsKey(h)) {
					System.out.println("Found the loop");
					prev.next=null;
					return 1;
				}
				else {
					hs.put(h, h.data);
					prev=h;
					h=h.next;
				}
			}
			System.out.println("No loop found");
			return 0;
			
			
		}
		public Node reverk(Node h,int k) {
			Node curr=h;
			Node prefirs=null;
			Boolean firhead=true;
			
			
			while(curr!=null){
				Node first=curr;
				Node next=null;
				Node prev=null;
				int count=0;
				while(curr!=null && count<k) {
					 next=curr.next;
					curr.next=prev;
					prev=curr;
					curr=next;
					count++;
				}
				if(firhead) {
					 head=prev;
					 firhead=false;
				}
				else {
					prefirs.next=prev;
				}
				prefirs=first;
			}
			return head;
		}
		public void removenode(Node h) {
			h.data=h.next.data;
			h.next=h.next.next;
		}
		public Node evenodd(Node h) {
			Node es=null;
			Node ee=null;
			Node os=null;
			Node oe=null;
			
			for(Node curr=h;curr!=null;curr=curr.next) {
			int i=curr.data;
			if(i%2==0) {
				//Node newnode=new Node(i);
				if(es==null) {
				es=curr;
				ee=es;
				}
				else {
					ee.next=curr;
					ee=ee.next;
				}
				
			}
			else {
				//Node newnode=new Node(i);
				if(os==null) {
				os=curr;
				oe=os;
				}
				else {
					oe.next=curr;
					oe=oe.next;
				}
				
			}
		}
		if(os==null || es==null) {
			return h;
			
		}
		
			ee.next=os;
			oe.next=null;
		
		return es;
}
		public Node mergelink(Node a, Node b) {
			if(a==null) {
				return b;
			}
			if(b==null) {
				return a;
			}
			Node h=null;
			Node t=null;
			if(a.data<b.data) {
				 h=a;
				 t=a;
				a=a.next;
			}
			else {
				 h=b;
				 t=b;
				b=b.next;
			}
			while(a!=null && b!=null) {
				if(a.data<b.data) {
					t.next=a;
					t=a;
					a=a.next;
				}
				else {
					t.next=b;
					t=b;
					b=b.next;
				}
			}
			if(a==null) {
				t.next=b;
			}
			else {
				t.next=a;
			}
			return h;
		}
		/*public void mergesorlin(Node h) {
			if(Node h.next==null) {
				return head;
			}
			Node f=mid(link);
			node n=f.next;
			
			Node a=mergsor(h);
			Node b=mergsor(n);
			merge(a,b);
			*/
		
		
}
