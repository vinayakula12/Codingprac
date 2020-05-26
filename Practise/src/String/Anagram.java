package String;

public class Anagram {
	
	public static boolean ana(String s1,String s2) {
		char s3[]=s1.toCharArray();
		char s4[]=s2.toCharArray();
		int count[]=new int[256];
		for(int i=0;i<s3.length;i++) {
			count[s3[i]]++;
			//System.out.println(count[s3[i]]);
		}
		for(int i=0;i<s4.length;i++) {
			count[s4[i]]--;
			//System.out.println(count[s3[i]]);
		}
		
		for(int i=0;i<256;i++) {
			if(count[i]!=0){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ana("geeks","geek");
		
		if (ana("geeks", "geeks")) 
            System.out.println("The two strings are "
                               + "anagram of each other"); 
        else
            System.out.println("The two strings are not"
                               + " anagram of each other"); 

	}

}
