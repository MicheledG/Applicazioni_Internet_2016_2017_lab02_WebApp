package it.polito.ai.es02.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class BusLineStopPK implements Serializable{
	
	@ManyToOne
	private BusLine busLine;
	@ManyToOne
	private BusStop busStop;
	public BusLine getBusLine() {
		return busLine;
	}
	public void setBusLine(BusLine busLine) {
		this.busLine = busLine;
	}
	public BusStop getBusStop() {
		return busStop;
	}
	public void setBusStop(BusStop busStop) {
		this.busStop = busStop;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((busLine == null) ? 0 : busLine.hashCode());
		result = prime * result + ((busStop == null) ? 0 : busStop.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BusLineStopPK other = (BusLineStopPK) obj;
		if (busLine == null) {
			if (other.busLine != null)
				return false;
		} else if (!busLine.equals(other.busLine))
			return false;
		if (busStop == null) {
			if (other.busStop != null)
				return false;
		} else if (!busStop.equals(other.busStop))
			return false;
		return true;
	}
	
	
	
	
}
