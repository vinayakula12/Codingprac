package package1;

import java.util.Stack;

public class prevgreater {
	public static void pre(int ar[]) {
		
		Stack<Integer> hs=new Stack<Integer>();
		
		hs.push(ar[0]);
		System.out.print("-1");
		for(int i=1;i<ar.length;i++) {
			while(!hs.empty() && ar[i]>hs.peek()  ) {
				hs.pop();
			}
			 if(hs.empty()) {
				System.out.print("-1 ");
			}
			else {
				System.out.print(hs.peek()+ " ");
			}
			hs.push(ar[i]);
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 11, 13, 21, 3 }; 
		pre(arr);


	}

}
