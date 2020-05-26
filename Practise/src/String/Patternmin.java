package String;

import java.util.HashMap;

public class Patternmin {

	public static String  patemin(String s1,String s2) {
		char a1[]=s1.toCharArray();
		char a2[]=s2.toCharArray();
		String result="";
		HashMap<Character, Integer> h1=new HashMap<Character ,Integer>();
		for(int i=0;i<a1.length;i++) {
			if(h1.containsKey(a1[i])) {
				h1.put(a1[i], h1.get(a1[i])+1);
			}
			else {
					h1.put(a1[i], 1);
				}
			}
		int goalsize=s1.length();
		
		HashMap<Character, Integer> h2=new HashMap<Character ,Integer>();
		int count=0;
		int j=0;
		int minlen=s2.length();
		for(int i=0;i<a2.length;i++) {
			if(!h1.containsKey(a2[i])) {
				continue;
			}
			
			if(h2.containsKey(a2[i])) {
				h2.put(a2[i], h2.get(a2[i])+1);
			}
			else {
					h2.put(a2[i], 1);
				}
			if(h1.get(a2[i])>=h2.get(a2[i])) {
				count++;
			}
			
			if(count==goalsize) {
				while(!h1.containsKey(a2[j]) || h2.get(a2[j])>h1.get(a2[j])) {
					
					if(h1.containsKey(a2[j]) && h2.get(a2[j])>h1.get(a2[j])) {
						h2.put(a2[j], h2.get(a2[j])-1);
					}
					j++;
				}
				if(minlen>i-j+1) {
					minlen=i-j+1;
					System.out.println("first is "+i+" "+j);
					result = s2.substring(j, i+1);
				}
			}
			}
		
		return result;
		}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s2 = "ADOBECODEBANC" ;
		String s1 = "ABC";
		System.out.println(patemin(s1,s2));

	}

}
