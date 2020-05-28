package twodarray;

import java.util.ArrayList;

public class twarray {

	static ArrayList<point> X=new ArrayList<point>();
	static ArrayList<point> Y=new ArrayList<point>();
	public static void map(char ar[][]) {
		for (int i=0; i<ar.length; i++) {
            for (int j=0; j<ar[i].length; j++) {
                if (ar[i][j] == 'X') {
                	//point p1= new point(i,j);
                	X.add(new point(i,j));
                }
                	
                if (ar[i][j] == 'Y') {
                	Y.add(new point(i,j));
                	}
            }}
		for(int j=0;j<X.size();j++) {
			System.out.println(" X coordinate is "+X.get(j).x+" Y coordinate is "+X.get(j).y);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char mat[][] = { { 'X', 'O','O' }, 
                { 'O', 'Y', 'O' }, 
                { 'X', 'Y', 'O'}}; 
		
		map(mat);

	}

}
//https://www.geeksforgeeks.org/merging-intervals/