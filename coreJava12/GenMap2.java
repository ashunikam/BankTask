package coreJava12;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
public class GenMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map=new HashMap<>();
		map.put(100, "abc");
		map.put(101,"Sam");
		map.put(102,"Harry");
		List<Map.Entry<Integer, String>>list=new ArrayList<>(map.entrySet());
		Set<Map.Entry<Integer,String>>set=map.entrySet();
		Iterator<Entry<Integer, String>> itr=set.iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer, String> e=itr.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}
		System.out.println("-----------------------------------------------------");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getKey()+" "+list.get(i).getValue());
		}
		

	}

}
