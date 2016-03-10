import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

import com.sun.javafx.collections.MappingChange.Map;


public class classTwo {

	public static void main(String[] args) {
		int var3= 1;
		int var4= 2;
		int var5, var6;
		
		HashMap hm = new HashMap();
		
		
		
		LinkedHashSet <String> set = (LinkedHashSet<String>) new HashSet();
		set.add("Hell");
		set.add("Bye");
		
		for(String s : set){
			System.out.println(s);
		}
		
	//	ArrayList <Map.Entry> a = new ArrayList (map.entrySet());
		
		classOne cl = new classOne(var3, var4);
		classOne cl2 = new classOne(7, 8);
			
		//System.out.println(cl2.compareTo(cl));
		
		cl.printHi();
		cl.printHi();
	}

	public void printHi(){
		System.out.println("Hello dere");
	}
	public classTwo() {
	}
}
