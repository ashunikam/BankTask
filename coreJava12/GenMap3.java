package coreJava12;
import java.util.*;

public class GenMap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(100, "Bala");
		map.put(101, "Sam");
		map.put(102, "Harry");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

	}

}
