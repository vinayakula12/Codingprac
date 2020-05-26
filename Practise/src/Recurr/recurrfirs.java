package Recurr;

public class recurrfirs {
public static void fron(int k) {
	if(k==0) {
		return;
	}
	System.out.print(k+" ");
	fron(k-1);
}

public static void tailrecur(int k) {
	if(k==0) {
		return;
	}
	tailrecur(k-1);
	System.out.print(k+" ");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//fron(4);
		tailrecur(4);

	}

}
