package Recurr;

public class Fact {
public static int fact(int k) {
	if (k==1) {
		return 1;
	}
	return k*fact(k-1);

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(3));

	}

}
