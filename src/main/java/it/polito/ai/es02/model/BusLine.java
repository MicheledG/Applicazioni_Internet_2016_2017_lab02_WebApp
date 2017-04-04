package it.polito.ai.es02.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BusLine {
	
	@Id
	private String line;
	private String description;
	
	public String getLine() {
		return line;
	}
	public void setLine(String line) {
		this.line = line;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
