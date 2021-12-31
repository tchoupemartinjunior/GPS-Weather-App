package group3.tp5.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class jsonText {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		// TODO Auto-generated method stub
		ObjectMapper mapper = new ObjectMapper();	
		String position="{\"type\": \"FeatureCollection\", \"version\": \"draft\", \"features\": [{\"type\": \"Feature\", \"geometry\": {\"type\": \"Point\", \"coordinates\": [0.198402, 47.989523]}, \"properties\": {\"label\": \"3 Rue de Torc\\u00e9 72100 Le Mans\", \"score\": 0.9716709090909089, \"housenumber\": \"3\", \"id\": \"72181_5265_00003\", \"name\": \"3 Rue de Torc\\u00e9\", \"postcode\": \"72100\", \"citycode\": \"72181\", \"x\": 491060.51, \"y\": 6769166.46, \"city\": \"Le Mans\", \"context\": \"72, Sarthe, Pays de la Loire\", \"type\": \"housenumber\", \"importance\": 0.68838, \"street\": \"Rue de Torc\\u00e9\"}}], \"attribution\": \"BAN\", \"licence\": \"ETALAB-2.0\", \"query\": \"3 Rue de Torc\\u00e9 72100 Le Mans\", \"filters\": {\"type\": \"housenumber\"}, \"limit\": 5}";
		JsonNode rootNode = mapper.readTree(position);
		
		System.out.println(rootNode);
		System.out.println("Bonjour");
		String coordString = rootNode.findValues("features").get(0).toString();
		System.out.println(rootNode.findValues("features").get(0).toString());
		
	
	}

}
