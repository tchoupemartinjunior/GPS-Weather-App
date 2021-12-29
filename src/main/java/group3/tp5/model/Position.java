package group3.tp5.model;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat.Feature;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

public class Position {
	@JsonIgnoreProperties("type")
	public String type;
	
	@JsonProperty("version")
	public String version;
	
	@JsonProperty("features")
	public Feature feature;
	
	

	public Position() {}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
	

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	

	@Override
	public String toString() {
		return "Position [type=" + type + ", version=" + version + ", feature=" + feature + "]";
	}

	

	
	
	

}
	