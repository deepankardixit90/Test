package home.mytests.test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class StringTest {

	public StringTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//System.out.println("abc".compareTo("def"));
		
		Map<String, Integer> map = new TreeMap<String, Integer>();
		map.put("p",1);
		map.put("sa", 2);
		map.put("b", 3);
		map.put("sb", 2);
		SortedSet<Map.Entry<String,Integer>> set = entriesSortedByValues(map);
		Iterator<Entry<String, Integer>> iterator = set.iterator();
		while (iterator.hasNext()){
			Entry<String, Integer> next = iterator.next();
			System.out.println("key ="+next.getKey()+" value ="+next.getValue());
		}
		

	}
	
	private static <K,V extends Comparable<? super V>> SortedSet<Map.Entry<K,V>> entriesSortedByValues(Map<K,V> map) {
	    SortedSet<Map.Entry<K,V>> sortedEntries = new TreeSet<Map.Entry<K,V>>(
	        new Comparator<Map.Entry<K,V>>() {
	            @Override 
	            public int compare(Map.Entry<K,V> e1, Map.Entry<K,V> e2) {
	                int res = e1.getValue().compareTo(e2.getValue());
	                return res != 0 ? res : 1;
	            }
	        }
	    );
	    sortedEntries.addAll(map.entrySet());
	    return sortedEntries;
	}

}
