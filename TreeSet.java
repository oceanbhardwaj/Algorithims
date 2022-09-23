/*package whatever //do not write package name here */

import java.util.*;

class GFG {
   static class Emp{
        int id;
        String name;
        public Emp(int id,String name){
            this.id=id;
            this.name=name;
        }
    }
     @SuppressWarnings("unchecked")
	public static void main (String[] args) {
	
	/*TreeSet<Integer> set=new TreeSet<>();
	set.add(1);
	set.add(211);
	set.add(4);
	System.out.println(set);
	*/
	
	/****************************************************************************************/
	Comparator co=new Comparator<Emp>(){
	    public int compare(Emp e1,Emp e2){
	        return e1.id-e2.id;
	      // return (e1.name).compareTo(e2.name);
	    }
	};
	//providing obj
	TreeSet<Emp> set=new TreeSet<>(co);
	set.add(new Emp(177,"toy"));
	set.add(new Emp(12,"arab"));
	set.add(new Emp(2222,"dec"));
	set.add(new Emp(33,"yyyyy"));

    for(Emp e:set)
	System.out.println(e.id+"  "+e.name);
	
	System.out.println("*********************************************");
	/****************************************************************************************/
   //provinding annonomous class
    TreeSet<Emp> t=new TreeSet<Emp>(new Comparator<Emp>(){
        public int compare(Emp e1,Emp e2){
            return e1.id-e2.id;
        }
    });
    t.add(new Emp(11477,"abc"));
	t.add(new Emp(122,"cde"));
	t.add(new Emp(2134222,"gh"));
	t.add(new Emp(323,"aaa"));
    for(Emp e:t)
	System.out.println(e.id+"  "+e.name);
	
		System.out.println("*********************************************");
		
		//using lambda expression
		TreeSet<Emp> t2=new TreeSet<Emp>((o1,o2)->(o1.name).compareTo(o2.name));
		t2.add(new Emp(122222222,"abc"));
	    t2.add(new Emp(122,"cde"));
	    t2.add(new Emp(2134222,"gh"));
        t2.add(new Emp(323,"aaa"));
        for(Emp e:t2)
	System.out.println(e.id+"  "+e.name);
}	
	
		
	
}