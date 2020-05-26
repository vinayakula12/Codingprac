import java.util.HashMap;

public class anag {
	public static int ana( String s1,String s2) {
		char ar1[]=s1.toCharArray();
		char ar2[]=s2.toCharArray();
		HashMap<Character,Integer> hs=new HashMap<Character,Integer>();
		for(int i=0;i<ar1.length;i++) {
			if(hs.containsKey(ar1[i])){
				hs.put(ar1[i], hs.get(ar1[i])+1);
			}
			else {
				hs.put(ar1[i], 1);
			}
		}
		for(int j=0;j<ar2.length;j++) {
			if(hs.containsKey(ar2[j])) {
				hs.put(ar2[j], hs.get(ar2[j])-1);
			}
			else {
				System.out.println("not anagram");
				return 0;
			}
		}
		
		 for(HashMap.Entry<Character,Integer> entry:hs.entrySet()) {
			 if(entry.getValue()!=0) {
				 System.out.println("not anagram");
				 return 0;
			 }
		 }
		 System.out.println("It is anagram");
		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ana("geeksforgeeks","forgejeksgeeks");

	}

}
