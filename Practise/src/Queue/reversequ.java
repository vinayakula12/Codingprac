package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reversequ {
	static Queue<Integer> q1 =new LinkedList<Integer>();
	public static void rever() {
		Stack<Integer> hs =new Stack<Integer>();
		while(!q1.isEmpty()) {
			hs.push(q1.poll());
		}
		while(!hs.isEmpty()) {
			q1.add(hs.pop());
		}
		
	}
	static void Print() 
    { 
        while (!q1.isEmpty()) { 
            System.out.print( q1.peek() + ", "); 
            q1.remove(); 
        } 
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	q1.add(10); 
        q1.add(20); 
        q1.add(30); 
      q1.add(40); 
      rever();
      Print(); 
      
       

	}

}
