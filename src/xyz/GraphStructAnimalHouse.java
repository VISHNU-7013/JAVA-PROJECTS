package xyz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphStructAnimalHouse {

	public static void main(String[] args) {
		Map<String,List<String>> AnimalHouse = new HashMap<>();
		AnimalHouse.put("Entrance", Arrays.asList("Reptile House","Bird Sanctuary","Mamal Zone"));
		AnimalHouse.put("Reptile House", Arrays.asList("Snake pit"));
		AnimalHouse.put("Bird Sanctuary",Arrays.asList("Parrot Pavilion"));
		AnimalHouse.put("Mamal zone",Arrays.asList("Lion Den","Elephant Enclosure"));
		AnimalHouse.put("Snake pit", new ArrayList<String>());
		AnimalHouse.put("Parrot Pavilion", new ArrayList<String>());
		AnimalHouse.put("Lion Den", new ArrayList<String>());
		AnimalHouse.put("Elephant Enclosure", new ArrayList<String>());
		//System.out.println(AnimalHouse);
		for(String animals :AnimalHouse.keySet()) {
			System.out.println(animals +" is Connected to : "+AnimalHouse.get(animals));
			
		}
	}

}
