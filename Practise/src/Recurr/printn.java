package Recurr;

public class printn {
	public static void printNos(int N)
    {
        //Your code here
        if(N==1){
            System.out.println("1");
            return;
        }
        printNos(N-1);
        System.out.println(N);
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNos(32);

	}

}
