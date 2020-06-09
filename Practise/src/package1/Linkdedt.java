package package1;

import Listlin.Node;

public class Linkdedt {
	
	Nodet head;
	public void addbegin(int d) {
		Nodet newnode=new Nodet(d);
		newnode.next=head;
		head=newnode;
		
	}
	public void delete () {
		head=head.next;
	}
	public void addend(int d) {
		Nodet newnode=new Nodet(d);
		Nodet curr=head;
		while(curr.next!=null) {
			curr=curr.next;
		}
		curr.next=newnode;
		
		
	}
	public void print(Nodet h) {
		Nodet curr=h;
		while(curr!=null) {
			System.out.print(curr.d+" ");
			curr=curr.next;
		}
	}
	
	
	public void printnfromend(int k) {
		Nodet curr1=head;
		Nodet curr2=head;
		int i=0;
		while(i<k) {
			
			curr1=curr1.next;
			i++;
		}
		
while(curr1.next!=null) {
			
			curr1=curr1.next;
			curr2=curr2.next;
		}

System.out.println("The data from end is "+curr2.d);
	}
	public Nodet reverse() {
		Nodet f=null;
		Nodet p=null;
		Nodet curr=head;
		while(curr!=null) {
			f=curr.next;
			curr.next=p;
			p=curr;
			curr=f;
			
		}
		return p;
		
		
	}
	
	public Nodet reversefromk(Nodet h,int k) {
		
		Nodet prevfirs=null;
		Nodet curr=h;
		boolean first=true;
		
		
		
		
		while(curr!=null){
			Nodet first1=curr;
			Nodet f=null;
			Nodet p=null;
			int count=0;
		while(curr!=null && count<k) {
			
			f=curr.next;
			curr.next=p;
			p=curr;
			curr=f;
			count++;
			
		}
		if(first) {
			h=p;
			first=false;
			
		}
		else {
			prevfirs.next=p;
		}
		
		prevfirs=first1;
		
		
		}
		return h;
	}
	public Nodet sortlink(Nodet a,Nodet b) {
		Nodet h;
		Nodet t;
		if(a==null) {
			return b;
		}
		if(b==null) {
			return a;
		}
		
			if(a.d<b.d) {
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
			if(a.d<b.d) {
				
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
	
}


