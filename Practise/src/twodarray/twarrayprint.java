package twodarray;

public class twarrayprint {

	public static void arr(int ar[][]) {
		
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				System.out.print(ar[i][j]+" ");
			}
			System.out.println(" ");
		}
		
	}
	
	public static void search(int ar[][],int k) {
		int r=ar.length;
		int c=ar[1].length;
		int i=0;
		int j=c-1;
		while(i<r &&  j>=0) {
			if(ar[i][j]==k) {
				System.out.println("found the element at "+i+" "+j);
				return;
			}
			else if(ar[i][j]>k) {
				j--;
			}
			else {
				i++;
			}
		}
		System.out.println("element not found ");
	}
public static void transarr(int ar[][]) {
		
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar[i].length;j++) {
				int temp=ar[i][j];
				ar[i][j]=ar[j][i];
				ar[j][i]=temp;
			}
			
		}
		
	}
public static void spiral(int ar[][]) {
	
	int top=0;
	int bot=ar.length;
	int left=0;
	int right=ar[1].length;
	while(top<bot && left<right) {
		for(int i=left;i<right;i++) {
			System.out.println(ar[top][i]);
		}
		top++;
		for(int i=top;i<bot;i++) {
			System.out.println(ar[i][right-1]);
		}
		right--;
		for(int i=right-1;i>=left;i--) {
			System.out.println(ar[i][right-1]);
		}
		bot--;
		for(int i=bot;i>=top;i--) {
			System.out.println(ar[i][left]);
		}
		left++;
		
	}
	
}

public static void reve(int ar[][]) {
	
	for(int i=0;i<ar.length;i++) {
		int l=0;
		int len=ar[1].length-1;
		while(l<len) {
			int temp=ar[i][l];
			ar[i][l]=ar[i][len];
			ar[i][len]=temp;
			l++;
			len--;
		}
		
	}
	
}
public static void snakearr(int ar[][]) {
		
		for(int i=0;i<ar.length;i++) {
			if(i%2==0) {
			for(int j=0;j<ar[i].length;j++) {
				System.out.print(ar[i][j]+" ");
			}
			}
			
			if(i%2!=0) {
				for(int j=ar[i].length-1;j>=0;j--) {
					System.out.print(ar[i][j]+" ");
				}
				}
			
		}
		
	}
public static void bounarr(int ar[][]) {
	int n=ar.length;
	int m=ar[1].length;
	
	for(int i=0;i<ar.length;i++) {
		for(int j=0;j<ar[i].length;j++) {
			if(i==0) {
			System.out.print(ar[i][j]+" ");
			}
			else if(i==n-1) {
				System.out.print(ar[i][j]+" ");
				}
			else if(j==m-1) {
				System.out.print(ar[i][j]+" ");
				}
			
			else if(j==0) {
				System.out.print(ar[i][j]+" ");
				}
			
			
			else  {
				System.out.print(" ");
				}
			//System.out.println(" "); 
		}
		System.out.println(" ");
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mat[][] = { { 1, 2, 3, 4 }, 
                { 5, 6, 7, 8 }, 
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }}; 
		//snakearr(mat); 
	//arr(mat); 
		//transarr(mat);
		//arr(mat);
		//System.out.println(" ");
		//reve(mat);
		//arr(mat);
		//search(mat,15);
		spiral(mat);

	}

}
