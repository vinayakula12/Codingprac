package Stack;

public class twostackarr {

	int ar[]= new int[100];
	int top1=-1;
	int top2=ar.length;
	int size=ar.length;
	
	
	public void push1(int a) {
		if(top1<top2-1) {
		top1++;
		ar[top1]=a;
		}
		
	}
	
	public void push2(int a) {
		if(top1<top2-1) {
		top2--;
		ar[top2]=a;
		}
		
	}
	
	public int pop1() {
		if(top1>-1) {
			int temp=ar[top1];
			top1--;
			return temp;
		}
		return 0;
	}
	
	public int pop2() {
		if(top2<size) {
			int temp=ar[top2];
			top2++;
			return temp;
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		twostackarr ts = new twostackarr(); 
        ts.push1(5); 
        ts.push2(10); 
        ts.push2(15); 
        ts.push1(11); 
        ts.push2(7); 
        System.out.println("Popped element from" + 
                           " stack1 is " + ts.pop1()); 
        ts.push2(40); 
        System.out.println("Popped element from" + 
                         " stack2 is " + ts.pop2()); 
	}

}
