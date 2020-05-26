
public class Permutlet {
	
public static void let(String st,String curr,int index) {
	int n = st.length();  
	  
    // base case  
    if (index == n) 
    {  
        System.out.println(curr+" "); 
        return;  
    }  
	let(st,curr,index+1);
	let(st,curr+st.charAt(index),index+1);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";  
        int index = 0; 
        String curr=""; 
        let(str,curr,index);  
  
	}

}
