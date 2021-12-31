package group3.tp5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import group3.tp5.model.Address;

@Controller
public class MeteoController {
	
	// la cle de l'API de meteo Weather Stack
	final static String weatherStackApi_KEY = "fdf8a371822fd868f8806e703adacd4e";
	
	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(method = RequestMethod.POST, value = "formulaire/meteo")
	public String getMeteo(@ModelAttribute Address address, Model model)
			throws JsonMappingException, JsonProcessingException {
		
		model.addAttribute("address", address);
		
		String adresse = address.getContent();
		ObjectMapper mapper = new ObjectMapper();
		
		// l'appel de l'API de localisation
		String gpsUrl = "https://api-adresse.data.gouv.fr/search/?q=" + adresse + "&type=housenumber&autocomplete=1";
		String position = restTemplate.getForObject(gpsUrl, String.class);
		
		// l'appel de l'API de meteo
		String meteoUrl = "http://api.weatherstack.com/current?access_key=" + weatherStackApi_KEY + "&query=" + adresse;
		String meteoJsonString = restTemplate.getForObject(meteoUrl, String.class);
		
		
		JsonNode rootNode = mapper.readTree(position);
		JsonNode rootNode2 = mapper.readTree(meteoJsonString);
		
		// extraction de la latitude et la longitude
		List<JsonNode> coordString = rootNode.findValues("geometry");
		JsonNode coordonnees = coordString.get(0).findValue("coordinates");
		String lat = coordonnees.get(1).toString();
		String lon = coordonnees.get(0).toString();
		
		model.addAttribute("coordinates", "\n lat :" + lat + "\nlon :" + lon);
		model.addAttribute("lat", lat);
		model.addAttribute("lon", lon);

		// extraction de la temperature
		List<JsonNode> meteoActuel = rootNode2.findValues("current");
		String temperature = rootNode2.findValue("temperature").toString();
		
		model.addAttribute("temperature", temperature);
		
		return "meteo";

	}
}
