package twodarray;

public class twodar {
	public static   void twodprint(int arr[][]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[1].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
	public static   void adjtwodprint(int arr[][]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr[1].length;j++) {
				int temp=arr[i][j];
				 arr[i][j]=arr[j][i];
				 arr[j][i]=temp;
			}
			
		}
	}
	
	public static void reve(int arr[][]) {
		for(int i=0;i<arr[1].length;i++) {
			int l=0;
			int h=arr.length-1;
			while(l<h) {
				int temp=arr[l][i];
				arr[l][i]=arr[h][i];
				arr[h][i]=temp;
				l++;
				h--;
				
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][] = { { 1, 2, 3, 4 }, 
                { 5, 6, 7, 8 }, 
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }}; 
		twodprint(mat);
		adjtwodprint(mat);
		twodprint(mat);
		reve(mat);
		twodprint(mat);
		
		

	}

}
