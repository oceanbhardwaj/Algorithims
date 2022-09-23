/*package whatever //do not write package name here */

import java.util.*;

class GFG  {
    
    
	public static void main (String[] args) {
	
	ArrayList<Emp> a=new ArrayList<>();
	a.add(new Emp(11,"ABC"));
	a.add(new Emp(2,"BCD"));
	a.add(new Emp(34,"cv"));
	a.add(new Emp(33,"hjk"));
	a.add(new Emp(787,"HSFDF"));
	System.out.println("before sorting :"+a);
	Collections.sort(a);
	

	System.out.println("after sorting :"+a);
	}
	
}
class Emp implements Comparable<Emp>{
        int id;
        String name;
        public Emp(int id,String name){
            this.id=id;
            this.name=name;
        }
    @Override
	public int compareTo(Emp e){
	    return this.id-e.id;
	}
    public String toString(){
        return id+"  "+name;
    }
    
    
    
    
}