package com.app.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapExample2 {

	public static void main(String[] args) {
		
		Map<Integer,Integer> map = new HashMap<>();
		
		map.put(1,10);
		map.put(3,2);
		map.put(6,5);
		map.put(9,12);
		map.put(18,8);
		map.put(4,4);
		
		for(Map.Entry<Integer,Integer> m : map.entrySet()) {
			System.out.println("Key:"+m.getKey()+ " value:"+m.getValue());
		}
		
		System.out.println("Print Only Key :"+map.keySet());
		System.out.println("Print only values :"+map.values());
		
		Map<Integer,Integer> map1= map.entrySet().stream()
		.filter(entry -> entry.getKey()%3==0)
		.collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
		
		System.out.println(map1);
		
		Map<Integer,Integer> map2 = map.entrySet()
				.stream()
				.filter(entry->(entry.getKey()%3==0 || entry.getKey()%3==1))
				.filter(entry->entry.getValue()%2==0)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		System.out.println(map2);
		
		Map<Integer,Integer> map3 = map.entrySet().stream()
				.filter(entry->entry.getKey()%3==0 || entry.getKey()%3==1)
				.filter(entry->entry.getValue()%2==0)
				.collect(Collectors.toMap(entry->entry.getKey(), entry->entry.getValue()));
		
		System.out.println(map3);
		

	}

}
