package Stack;

import java.util.Arrays;

public class Stackimple {
	
	int ar[]= new int[100];
	int top=-1;
	public void push1(int x) {
		if(top==ar.length-1) {
			System.out.println("aray is full");
			return;
		}
		top++;
		ar[top]=x;
	}
	public int pop1() {
		if(top==-1) {
			System.out.println("aray is empty");
			return 0;
		}
		int temp=ar[top];
		top--;
		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stackimple hs=new Stackimple();
		
		hs.push1(10);
		hs.push1(20);
		hs.push1(30);
		System.out.println(Arrays.toString(hs.ar));
		hs.pop1();
		hs.push1(50);
		System.out.println(Arrays.toString(hs.ar));

	}

}
