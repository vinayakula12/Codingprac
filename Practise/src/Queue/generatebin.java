package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class generatebin {
	
	public static void gennum(int n) {
		Queue<String> q1=new LinkedList<String>();
		q1.add("1");
		for(int i=0;i<n;i++) {
			String s=q1.poll();
			System.out.println(s+" ");
			q1.add(s+"0");
			q1.add(s+"1");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=10; 
		gennum(n); 

	}

}
