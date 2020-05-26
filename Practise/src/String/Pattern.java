package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Pattern {
public static void Strpat(String s1,String s2) {
	char a1[]=s1.toCharArray();
	char a2[]=s2.toCharArray();
	HashMap<Character, Integer> h1=new HashMap<Character ,Integer>();
	for(int i=0;i<a1.length;i++) {
		if(h1.containsKey(a1[i])) {
			h1.put(a1[i], h1.get(a1[i])+1);
		}
		else {
				h1.put(a1[i], 1);
			}
		}
	
for(int i=0;i<a2.length-a1.length;i++) {
	HashMap<Character, Integer> h2=new HashMap<Character ,Integer>();
	for(int j=0;j<a1.length;j++) {
		if(h2.containsKey(a2[i+j])) {
			h2.put(a2[i+j], h2.get(a2[i+j])+1);
		}
		else {
				h2.put(a2[i+j], 1);
			}
		}
	if (samahash(h1,h2)) {
		System.out.println("found the string at "+i+" "+a2[i]);
		return;
	}
	
}}
	private static boolean samahash(HashMap<Character, Integer> h1, HashMap<Character, Integer> h2) {
	
	for(HashMap.Entry<Character, Integer> entry :h1.entrySet()) {
		if(h1.get(entry.getKey())-h2.getOrDefault(entry.getKey(),-1)!=0) {
			return false;
		}
	}
	return true;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abaa" ;
		String s2 = "eiabaaoo";
		Strpat(s1,s2);

	}

}
