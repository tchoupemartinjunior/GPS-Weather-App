package group3.tp5.controller;

import java.lang.reflect.Array;
import java.util.Map;

import org.apache.catalina.mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import group3.tp5.model.Address;
import group3.tp5.model.Position;

@RestController
public class APIController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	//Ne pas rentrer ladreese directement dans l'url
	/*static String adresse ="1 rue aristote,72000 Le Mans";// ceci permet de corriger lerreur d'encodage cause par eclipse 
	private static String url="https://api-adresse.data.gouv.fr/search/?q="+adresse+"&type=housenumber&autocomplete=1";*/
	
	@RequestMapping(method=RequestMethod.GET,value="formulaire/location")
	public String getPosition(@ModelAttribute Address address, Model model) throws JsonMappingException, JsonProcessingException {
		model.addAttribute("address",address);
		String adresse = address.getContent();// ceci permet de corriger lerreur d'encodage cause par eclipse 
		String url="https://api-adresse.data.gouv.fr/search/?q="+adresse+"&type=housenumber&autocomplete=1";
		
		
		ObjectMapper mapper = new ObjectMapper();	
		String position = restTemplate.getForObject(url, String.class);
		
		Map<String,Position> map = mapper.readValue(position, Map.class);
		System.out.println(map);
		System.out.println(adresse);
		JsonNode rootNode = mapper.readTree(position);
		System.out.println(rootNode.findValues("coordinates"));
	
		return rootNode.findValues("label").toString()+" coordonees GPS : "+rootNode.findValues("coordinates").toString();
	}
}
