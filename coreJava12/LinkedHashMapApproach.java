package coreJava12;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Iterator;

public class LinkedHashMapApproach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new LinkedHashMap<>();
//		LinkedHashMap<Integer,String> map=new LinkedHashMap<>();
		map.put(101, "aaa");
		map.put(102, "bbb");
		map.put(103, "ccc");
		System.out.println(map.put(103, "CCC"));
		map.put(102, "BBB");
		System.out.println(map);
		Set<Map.Entry<Integer, String>> set=map.entrySet();
		Iterator<Map.Entry<Integer, String>> itr=set.iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer, String> entry=itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		for(Map.Entry<Integer, String> m: map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	

	}

}
