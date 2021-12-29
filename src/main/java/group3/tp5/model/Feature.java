package group3.tp5.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import group3.tp5.model.Geometry;

public class Feature{
	@JsonIgnoreProperties("type") public String type;
	@JsonProperty("geometry") public Geometry geometry;
	public Feature() {
		
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Geometry getGeometry() {
		return geometry;
	}
	public void setGeometry(Geometry geometry) {
		this.geometry = geometry;
	}
	@Override
	public String toString() {
		return "Feature [type=" + type + ", geometry=" + geometry + "]";
	}
	
}