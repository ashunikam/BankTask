package coreJava12;
import java.util.*;

public class Gen1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list=new ArrayList();
		list.add(10);
		list.add("Ash");
		String s=(String)list.get(0);
		System.out.println(s);
		System.out.println(list.get(0));
		System.out.println(list);
		List<Integer> list1=new ArrayList<>();
		list1.add(10);
//		list1.add("Java");
		List<String> list2=new ArrayList<>();
		list2.add("Java");
		String st1=list2.get(0);
		System.out.println(st1);
		

	}

}
