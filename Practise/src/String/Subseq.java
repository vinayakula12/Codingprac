package String;

public class Subseq {
	
	public static void subseq(String ip,String op) {
		if(ip.length()==0) {
			System.out.println(op);
			return;
		}
		
		subseq(ip.substring(1),op);
		subseq(ip.substring(1),op+ip.charAt(0));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		subseq("ABC","");

	}

}
