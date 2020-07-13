package GraphArraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//class Interval{
//	int start;
//	int end;
//	 
//	Interval(int start,int end){
//		this.start=start;
//		this.end=end;
//	}
// }

public class listcompare {
//
//	@Override
//	public int compare(String o1, String o2) {
//		// TODO Auto-generated method stub
//		int l1=o1.length();
//		int l2=o2.length();
//		if(l1>l2) {
//			return 1;
//		}
//		
//		else if(l1<l2) {
//			return -1;
//		}
//		else {
//		return 0;
//	}
//	

public static  ArrayList<Interval> merge(ArrayList<Interval> hs){
	Collections.sort(hs,(a, b) -> Integer.compare(a.start, b.start));
	if(hs==null) {
		return null;
	}
	ArrayList<Interval> mer=new ArrayList<Interval> ();
	for(int i =0;i<hs.size();i++) {
		if(mer.isEmpty()|| mer.get(mer.size()-1).end<hs.get(i).start) {
			mer.add(hs.get(i));
		}
		else {
			mer.get(mer.size()-1).end=Math.max(hs.get(i).end,mer.get(mer.size()-1).end);
		}
	}
	
	return mer;
	
}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Interval> hs=new ArrayList<Interval>();
		Interval i1=new Interval(8,10);
		Interval i2=new Interval(1,3);
		Interval i3=new Interval(2,6);
		Interval i4=new Interval(3,9);
		Interval i5=new Interval(15,18);
		
		hs.add(i1);
		hs.add(i2);
		hs.add(i3);
		hs.add(i4);
		hs.add(i5);
		
		ArrayList<Interval> hs1=merge(hs);
	
		
		for(Interval ss:hs1) {
			System.out.println(ss.start+" "+ss.end);
		}
		
		
}
	
	}
 

