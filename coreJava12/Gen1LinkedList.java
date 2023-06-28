package coreJava12;
import java.util.*;

public class Gen1LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list=new LinkedList();
		list.add("10");
		list.add(10);
		String s1=(String)list.get(0);
		List<Integer> list1=new LinkedList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		list1.add(60);
		System.out.println(list1);
		Iterator i1=list1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
	}

}
