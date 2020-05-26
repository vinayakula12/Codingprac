package Stack;

import java.util.Stack;

public class Pregretor {

	public static void pregr(int ar[]) {
		Stack<Integer> hs=new Stack<Integer>();
		hs.push(ar[0]);
		System.out.print("-1 ");
		for(int i=1;i<ar.length;i++) {
			while(!hs.empty() && ar[i]>hs.peek()  ) {
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
		 int arr[] = { 10, 4, 2, 20, 40, 12, 30 }; 
		 pregr(arr);

	}

}
