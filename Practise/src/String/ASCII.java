package String;

public class ASCII {
public static void firstlete(String s) {
	char x1[]=s.toCharArray();
	int count[]= new int[256];
	for(int i=0;i<count.length;i++) {
		count[i]=0;
	}
	for(int i=1;i<x1.length;i++) {
		
		
		int c=x1[i];
		
		int b=x1[i-1];
		if(c<b) {
			System.out.println("the letter is "+ x1[i]);
		}
		
		//System.out.println(g);
		//count[x1[i]]++;
		//System.out.println(count[x1[i]]);
		//char j='A';
		//int f=j;
		//System.out.println(f);
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		firstlete("abcdea");

	}

}
