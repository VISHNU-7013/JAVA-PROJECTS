package xyz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

	public class SocialCircleDFS {

	    private Map<String, List<String>> socialMap = new HashMap<>();

	    // Add friendship connection (undirected)
	    public void addFriend(String person, String friend) {
	        socialMap.computeIfAbsent(person, k -> new ArrayList<>()).add(friend);
	        socialMap.computeIfAbsent(friend, k -> new ArrayList<>()).add(person);
	    }

	    // Recursive DFS version
	    public List<String> findSocialCircle(String person) {
	        Set<String> visited = new HashSet<>();
	        List<String> circle = new ArrayList<>();
	        dfsRecursive(person, visited, circle);
	        return circle;
	    }

	    private void dfsRecursive(String person, Set<String> visited, List<String> circle) {
	        if (visited.contains(person)) return;

	        visited.add(person);
	        circle.add(person);

	        for (String neighbour : socialMap.getOrDefault(person, new ArrayList<>())) {
	            dfsRecursive(neighbour, visited, circle);
	        }
	    }

	    // Iterative DFS version
	    public List<String> findSocialCircleIterative(String person) {
	        Set<String> visited = new HashSet<>();
	        List<String> circle = new ArrayList<>();
	        Stack<String> stack = new Stack<>();

	        stack.push(person);
	        while (!stack.isEmpty()) {
	            String current = stack.pop();
	            if (!visited.contains(current)) {
	                visited.add(current);
	                circle.add(current);

	                for (String neighbour : socialMap.getOrDefault(current, new ArrayList<>())) {
	                    stack.push(neighbour);
	                }
	            }
	        }

	        return circle;
	    }

	    // Main method to test both versions
	    public static void main(String[] args) {
	        SocialCircleDFS graph = new SocialCircleDFS();

	        // Creating a sample graph
	        graph.addFriend("Alice", "Bob");
	        graph.addFriend("Bob", "Charlie");
	        graph.addFriend("David", "Eve");
	        graph.addFriend("Eve", "Frank");
	        
	        System.out.println(graph.findSocialCircle("Alice"));
	        System.out.println(graph.findSocialCircle("David"));

	        System.out.println("Recursive DFS (social circle of Bob):");
	        List<String> recursiveCircle = graph.findSocialCircle("Bob");
	        System.out.println(recursiveCircle);

	        System.out.println("\nIterative DFS (social circle of Eve):");
	        List<String> iterativeCircle = graph.findSocialCircleIterative("Eve");
	        System.out.println(iterativeCircle);
	    }
	}
