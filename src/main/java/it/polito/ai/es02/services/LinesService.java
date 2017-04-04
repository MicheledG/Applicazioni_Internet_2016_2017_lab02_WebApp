package it.polito.ai.es02.services;

import java.util.List;

import it.polito.ai.es02.model.BusLine;
import it.polito.ai.es02.model.BusStop;

public interface LinesService {

	public List<BusLine> getLines();
	public List<BusStop> getLineStop(String lineId);
	
}