package String;

import java.util.Arrays;

public class Couttingsort {

	public static void sortm(char s[]) {
		Arrays.sort(s);
	for(int i=0;i<s.length;i++) {
//			int a=s[i];
		
		System.out.println(s[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[] = {'a','c', 'g','b','f','f'}; 
		sortm(arr);
	} 

}
