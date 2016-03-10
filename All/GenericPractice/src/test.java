import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;


public class test {
	
	public static void main(String [] args){
		Map<String, Double> grades = new TreeMap<String, Double>();
		grades.put("Qi Liao", 99.5);
		grades.put("Zack Smith", 75.0);
		grades.put("Mary Wilson", 82.5);

		System.out.println("Min: " + max(grades));
		System.out.println("Sort by keys:  " + grades);
		System.out.println("Sort by values: " + sortByValue(grades));

		Map<Integer, String> students = new TreeMap<Integer, String>();
		students.put(1234, "Qi Liao");
		students.put(5678, "Zack Smith");
		students.put(9000, "Mary Wilson");

		System.out.println("Max: " + max(students));
		System.out.println("Sort by keys:  " + students);
		System.out.println("Sort by values: " + sortByValue(students));
		
		
		
	}

			
			// find max value in a generic map
			public static <K, V extends Comparable<V>> V max(Map<K,V> map)
			{
				V max = null;
				for (K key : map.keySet())
				{
					V value = map.get(key);
					if (max == null)
						max = value;
					else if (value.compareTo(max) > 0)
						max = value;
				}
				return max;
			}

			// sort a generic map by values
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
