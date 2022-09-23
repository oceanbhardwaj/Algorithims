/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;

class GFG {
	public static void main (String[] args) {
		//HashMap sort
		
		HashMap<Integer,Integer> h=new HashMap<>();
		h.put(1,3);
		h.put(33,9);
		h.put(2,99);
		h.put(-1,889);
		
		System.out.println("map before sorting :"+h);
		List<Map.Entry<Integer,Integer>> list=new ArrayList<Map.Entry<Integer,Integer>>(h.entrySet());
		Collections.sort(list,new Comparator<Map.Entry<Integer,Integer>>(){
		    public int compare(Map.Entry<Integer,Integer> m1,Map.Entry<Integer,Integer> m2){
		        return m1.getKey()-m2.getKey();
		    }
		});
		System.out.println(list);
			HashMap<Integer,Integer> newmap=new LinkedHashMap<>();
			for(Map.Entry<Integer,Integer> e:list){
			    newmap.put(e.getKey(),e.getValue());
			}
			System.out.println("Values after sorting :"+newmap);
	}
	
}