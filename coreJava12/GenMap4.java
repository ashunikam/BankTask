package coreJava12;
import java.util.*;

public class GenMap4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new HashMap<>();
		map.put(1001, "Bala");
		map.put(101, "Sam");
		map.put(102, "Harry");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);

	}

}
