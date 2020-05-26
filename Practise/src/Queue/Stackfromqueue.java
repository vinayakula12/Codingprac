package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Stackfromqueue {
	
	static Queue<Integer> q1 =new LinkedList<Integer>();
	static Queue<Integer> q2 =new LinkedList<Integer>();
		
		
	public static Integer pop() {
		if(q1.isEmpty()) {
			System.out.println("stack is empty");
			return 0;
		}
		return q1.poll();
		
	}
	
	public static void push(int x) {
		while(!q1.isEmpty()) {
			q2.add(q1.poll());
		}
		q1.add(x);
		while(!q2.isEmpty()) {
			q1.add(q2.poll());
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		push(1); 
        push(2); 
       push(3); 
       System.out.println("first elemt is "+pop()); 
       System.out.println("second element is "+pop()); 
	}

}
