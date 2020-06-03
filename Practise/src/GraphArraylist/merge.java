package GraphArraylist;

import java.util.ArrayList;

class merge{
		
	
	public static void me1rge(ArrayList<Interval> mer) {
		int index=0;
		for(int i=1;i<mer.size();i++) {
			if(mer.get(index).end>mer.get(i).start) {
				mer.get(index).end=Math.max(mer.get(index).end, mer.get(i).end);
				mer.get(index).start=Math.min(mer.get(index).start, mer.get(i).start);
			}
			else {
				index++;
			}
		}
	}
	
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Interval> mer1=new ArrayList<Interval> ();
		mer1.add(new Interval(6,8));
		mer1.add(new Interval(1,9));
		mer1.add(new Interval(2,4));
		mer1.add(new Interval(4,7));
	
		me1rge(mer1);
	for(int i=0;i<mer1.size();i++) {
		System.out.print(mer1.get(i).start+" ");
		System.out.print(mer1.get(i).end+" ");
		System.out.println();
	}
		

	}

	}

