package Stack;

import java.util.Stack;

public class Stackexample {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> hs =new Stack<Integer>();
		hs.push(10);
		hs.push(20);
		hs.push(30);
		hs.push(40);
		while(!hs.empty()) {
			System.out.println(hs.pop());
		}
		hs.push(20);
		hs.push(30);
		hs.push(40);
		System.out.println("the peek is "+hs.peek());
		System.out.println("the size is "+hs.size());

	}

}
