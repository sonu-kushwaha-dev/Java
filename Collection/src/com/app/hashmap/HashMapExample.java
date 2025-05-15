package com.app.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap<>();
		
		map.put("a", null);
		map.put("b", 2);
		map.put("c", 3);
		map.put("d", 4);
		map.put(null, 4);
		
		for(Map.Entry<String,Integer> m : map.entrySet()) {
			System.out.println("Key : "+m.getKey() + ", Value : "+m.getValue());
		}
		
		//Increment each value by 5
		for(Map.Entry<String , Integer> m : map.entrySet()) {
			
			map.put(m.getKey(),Optional.ofNullable(map.getOrDefault(m.getKey(), 0)).orElse(0)+5);
			//Integer n = Optional.ofNullable(map.get(m.getKey())).orElse(0);
			
			// Optional.ofNullable(map.get(<key>)).orElse(0)
			//map.put(m.getKey(),n+5);
		}
		
		for(Map.Entry<String,Integer> m : map.entrySet()) {
			
			System.out.println("Key :"+m.getKey()+" value :"+m.getValue());
		}
		
		System.out.println("Flag "+map.containsKey("k"));
		System.out.println("Flag "+map.containsValue(9));
		System.out.println("Check null "+map.getOrDefault("p",0));
		
		Set<String> c = map.keySet();
		// Set<Integer> i = map.values();
		
		List<Integer> i2 = new ArrayList<>(map.values());
		
		System.out.println(map.keySet());
		//System.out.println(i);
		

	}
}
