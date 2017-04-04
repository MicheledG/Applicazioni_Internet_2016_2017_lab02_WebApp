package it.polito.ai.es02.model;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;

@Entity
@AssociationOverrides({
	@AssociationOverride(
			name="primaryKey.busLine", 
			joinColumns = @JoinColumn(name ="lineid")),
	@AssociationOverride(
			name="primaryKey.busStop",
			joinColumns = @JoinColumn(name ="stopId"))
})
public class BusLineStop {
	
	@EmbeddedId
	private BusLineStopPK primaryKey;
	private short sequenceNumber;
	public BusLineStopPK getPrimaryKey() {
		return primaryKey;
	}
	public void setPrimaryKey(BusLineStopPK primaryKey) {
		this.primaryKey = primaryKey;
	}
	public BusLine getBusLine(){
		return this.primaryKey.getBusLine();
	}
	public void setBusLine(BusLine busLine){
		this.primaryKey.setBusLine(busLine);
	}
	public BusStop getBusStop(){
		return this.primaryKey.getBusStop();
	}
	public void setBusStop(BusStop busStop){
		this.primaryKey.setBusStop(busStop);
	}
	public int getSequenceNumber() {
		return sequenceNumber;
	}
	public void setSequenceNumber(short sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}
	
	
}
