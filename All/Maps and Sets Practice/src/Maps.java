import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;




import com.sun.javafx.collections.MappingChange.Map;


public class Maps {
	
	static HashMap<Integer,String> hm = new HashMap();
	
	
	

	public static void main(String[] args) {
		TreeMap <Integer, String> TM = new TreeMap();
		hm.put(1,"Yse");
		
		ArrayList list = new ArrayList (hm.entrySet());
		System.out.println(list);
		

		TM=DSit(TM);
//		System.out.println();
//		System.out.println(TM.floorEntry(0));
	}
	 static TreeMap<Integer,String> DSit(TreeMap<Integer,String> map){
		 
		 List <Integer> lst = new LinkedList();
		 List <String> lst2 = new LinkedList();
		 
		 for (int i = 1; i<6; i++){
			 map.put(i, "hello");
		 }
		 for (Entry<Integer, String> entry : map.entrySet()) {
			 
			 if(entry.getKey()> 3){
				 System.out.println(entry);
			 }
			 
//		     System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
//		     lst.add(entry.getKey());
//		     lst2.add(entry.getValue());
		 }
//		 System.out.println(lst);
//		 System.out.println(lst2);
		 return map;
	 }
	

}
