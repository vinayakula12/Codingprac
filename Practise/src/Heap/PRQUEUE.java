package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class PRQUEUE {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> hs=new PriorityQueue<Integer>();
		hs.add(20);
		hs.add(10);
		hs.add(15);
		//System.out.println(hs.peek());
		
		PriorityQueue<Integer> hs1=new PriorityQueue<Integer>(Collections.reverseOrder());
		hs1.add(20);
		hs1.add(10);
		hs1.add(15);
		System.out.println(hs1.peek());
		

	}

}
