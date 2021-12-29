package group3.tp5.model;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


public class Geometry {
	@JsonProperty("type")
	private String type;
	
	@JsonProperty("coordinates")
	private String[] coordinates;
	
	
	
	public Geometry() {
	
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String[] getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(String[] coordinates) {
		this.coordinates = coordinates;
	}
	@Override
	public String toString() {
		return "Geometry [type=" + type + ", coordinates=" + Arrays.toString(coordinates) + "]";
	}
	
	
}
