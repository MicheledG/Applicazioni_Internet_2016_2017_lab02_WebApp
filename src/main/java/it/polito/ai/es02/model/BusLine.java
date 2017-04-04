package it.polito.ai.es02.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class BusLine implements Comparable<BusLine>{
	
	@Id
	private String line;
	private String description;
	@ManyToMany
	@JoinTable(name="buslinestop",
	joinColumns = {@JoinColumn(name="lineid")},
	inverseJoinColumns ={@JoinColumn(name="stopid")})
	private List<BusStop> stops = new ArrayList<BusStop>();
	
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
	public List<BusStop> getStops() {
		return stops;
	}
	public void setStops(List<BusStop> stops) {
		this.stops = stops;
	}
	public int compareTo(BusLine o) {
		return this.line.compareTo(o.getLine());
	}
	
}
