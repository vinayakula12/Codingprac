
public class cornertwmat {
	public static void spcori(int ar[][]) {
		
		int r=ar.length;
		int c=ar[1].length;
		for(int i=0;i<c;i++) {
			System.out.print(ar[0][i]+" ");
		}
		System.out.println();
		for(int i=1;i<r;i++) {
			System.out.print(ar[i][c-1]+" ");
		}
		System.out.println();
		for(int i=c-2;i>=0;i--) {
			System.out.print(ar[r-1][i]+" ");
		}
		System.out.println();
		for(int i=r-2;i>=1;i--) {
			System.out.print(ar[i][0]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][] = { { 1, 2, 3, 4 }, 
                { 5, 6, 7, 8 }, 
                { 9, 10, 11, 12 },
                {13,14,15,16}}; 
		spcori(mat);
	}

}
