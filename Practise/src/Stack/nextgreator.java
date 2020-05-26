package Stack;

import java.util.Stack;

public class nextgreator {
	public static void nextgre(int ar[]) {
	Stack<Integer> hs=new Stack<Integer>();
	int n=ar.length;
	hs.push(ar[n-1]);
	System.out.print("-1 ");
	for(int i=n-2;i>=0;i--) {
		while(!hs.empty() && ar[i]>hs.peek() ) {
			hs.pop();
		}
		if(hs.empty()) {
			System.out.print("-1 ");
		}
		else {
			System.out.print(hs.peek()+" ");
		}
		hs.push(ar[i]);
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 11, 13, 21, 3 }; 
		nextgre(arr);

	}

}
