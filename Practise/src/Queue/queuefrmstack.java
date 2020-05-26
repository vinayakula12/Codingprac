package Queue;

import java.util.Stack;

public class queuefrmstack {
	
	static Stack<Integer> s1 =new Stack<Integer>();
	static Stack<Integer> s2 =new Stack<Integer>();
	
	public static void enqueue(int x) {
		s1.add(x);
		
	}
	
	public static int dequeue() {
		if(s2.isEmpty()) {
			while(!s1.isEmpty()) {
				s2.add(s1.pop());
			}
		}
		return s2.pop();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		enqueue(1); 
		enqueue(2); 
		enqueue(3); 
  
		//System.out.println(dequeue());
		
        /* Dequeue items */
        System.out.print(dequeue() + " "); 
        System.out.print(dequeue() + " "); 
        System.out.println(dequeue ()+ " ");

	}

}
