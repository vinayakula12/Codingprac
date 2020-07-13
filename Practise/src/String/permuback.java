package String;

public class permuback {
	
	public static void permu(String a,int l,int r) {
		
		if(l==r) {
			System.out.println(a);
		}
		
		for(int i=l;i<r;i++) {
			a=swap(a,l,i);
			permu(a,l+1,r);
			a=swap(a,l,i);
		}
	}
	
	public static  String swap(String g,int i,int j) {
		
		char a[]=g.toCharArray();
		
		char temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		
		return String.valueOf(a); 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permu("ABC",0,3);

	}

}
