package xyz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SimpleDFS {
	
	private Map<String, List<String>> homeMap = new HashMap<String, List<String>>();
	private Set<String> visited = new HashSet<String>();
	public void addRoom(String room,String connectedRoom) {
		homeMap.computeIfAbsent(room, k -> new ArrayList<>()).add(connectedRoom);
		homeMap.computeIfAbsent(connectedRoom, k -> new  ArrayList<>()).add(room);
	}
		public void dfs(String currentRoom) {
			if(visited.contains(currentRoom)) return;
			
			visited.add(currentRoom);
			System.out.println("Visited: "+currentRoom);
			
			for(String neighbour : homeMap.getOrDefault(currentRoom, new ArrayList<String>())) {
				dfs(neighbour);
			}
		}

	public static void main(String[] args) {
		SimpleDFS home = new SimpleDFS();
		home.addRoom("Living Rooom", "Kitchen");
		home.addRoom("Living Rooom", "BedRoom");
		home.addRoom("BedRoom", "BathRoom");
		
		System.out.println("DFS Traversal starting from Living Room:\n");
		home.dfs("Living Rooom");

	}

}
