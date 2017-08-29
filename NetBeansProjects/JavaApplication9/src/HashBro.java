

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashBro {
	
	int k;
	String v;

	static HashMap <String, Integer> hm = new HashMap <String, Integer>();

	public static void main(String[] args) {
		for(String name : hm.keySet()){
			System.out.println(hm.get(name));
		}
		
		
	}
	
	
	public static <K, V extends Comparable<V>> List<Map.Entry<K, V>> sortByValue(Map<K,V> map)
	{
		List<Map.Entry<K, V>> list = new ArrayList<Map.Entry<K, V>>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<K, V>>()
		{
			public int compare(Map.Entry<K, V> e1, Map.Entry<K, V> e2)
			{
				return e1.getValue().compareTo(e2.getValue());
			}
		});
		return list;
	}

}
