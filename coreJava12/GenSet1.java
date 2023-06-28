package coreJava12;
import java.util.*;
public class GenSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set=new HashSet();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		set.add(10);
		set.add("as");
		System.out.println(set);
		Iterator i1=set.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next()+" ");
		}
		Set<Integer> set1=new HashSet<Integer>();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(40);
		set1.add(50);
		set1.add(10);
//		set1.add("as");
		System.out.println(set1);
		

	}

}
