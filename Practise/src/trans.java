import java.util.Arrays;

public class trans {
public static void transc(int ar[][]) {
		
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar[i].length;j++) {
				int s=ar[i][j];
				ar[i][j]=ar[j][i];
				ar[j][i]=s;
				
			}
		}
		
		
		
	}
public static void revrow(int ar[][]) {
	for(int i=0;i<ar.length;i++) {
		int s=0;
		int e=ar.length-1;
		while(s<e) {
			int g=ar[s][i];
			ar[s][i]=ar[e][i];
			ar[e][i]=g;
			s++;
			e--;
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][] = { { 1, 2, 3, 4 }, 
                { 5, 6, 7, 8 }, 
                { 9, 10, 11, 12 },
                {13,14,15,16}}; 
		
		System.out.println(Arrays.deepToString(mat));

		transc(mat);
		System.out.println(Arrays.deepToString(mat));
		revrow(mat);
		System.out.println(Arrays.deepToString(mat));
		

}}
