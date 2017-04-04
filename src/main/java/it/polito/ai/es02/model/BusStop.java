package it.polito.ai.es02.model;

import javax.persistence.Id;

import javax.persistence.Entity;

@Entity
public class BusStop {
	
	@Id
	private String id;
	private String name;
	private double lat;
	private double lng;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLng() {
		return lng;
	}
	public void setLng(double lng) {
		this.lng = lng;
	}
	
	
}
