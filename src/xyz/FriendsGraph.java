package xyz;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FriendsGraph {

	public static void main(String[] args) {
		Map<String, List<String>>  graph = new HashMap<>();
		graph.put("Basi", Arrays.asList("venkat"));
		graph.put("venkat", Arrays.asList("Basi","vishnu"));
		graph.put("vishnu", Arrays.asList("Basi"));
		
		for(String person : graph.keySet()) {
			System.out.println(person+"is friends with "+graph.get(person));
		}
		

	}

}
