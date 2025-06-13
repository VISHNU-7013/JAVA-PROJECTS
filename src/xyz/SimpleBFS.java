package xyz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class SimpleBFS {

	public static void main(String[] args) {
		Map<String, List<String>> graph = new HashMap<String, List<String>>();
		graph.put("Living Room", Arrays.asList("Kitchen","Bedroom","Study Room"));
		
		graph.put("Kitchen", Arrays.asList("Bathroom"));
		
		graph.put("Bedroom", Arrays.asList("Balcony"));
		
		graph.put("Study Room", new ArrayList<String>());
		
		graph.put("Bathroom", new ArrayList<String>());
		
		graph.put("Balcony", new ArrayList<String>());
		
		System.out.println("Exploring the house using BFS starting from living room");
		
		bfs(graph,"Living Room");
		

	}
	public static void bfs(Map<String, List<String>> graph,String startRoom) {
		Queue<String> queue=new LinkedList<String>();
		Set<String> visited=new HashSet<String>();
		
		queue.add(startRoom);
		visited.add(startRoom);
		
		while(!queue.isEmpty()) {
			String currentRoom=queue.poll();
			System.out.println("Visited "+currentRoom);
			
			for(String neighbour:graph.get(currentRoom)) {
				if(visited.contains(currentRoom)) {
					queue.add(neighbour);
					visited.add(neighbour);
				}
			}
		}
	
	}

}
