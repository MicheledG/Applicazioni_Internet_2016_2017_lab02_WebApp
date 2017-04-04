package it.polito.ai.es02.services;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import it.polito.ai.es02.model.BusLine;
import it.polito.ai.es02.model.BusStop;

public class LinesServiceImpl implements LinesService {
	
	private SessionFactory sessionFactory;
	
	public LinesServiceImpl(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	
	public List<BusLine> getLines() {

		List<BusLine> busLineList = null;
		
		//try accessing the db
		Session session = sessionFactory.openSession();
		String hql = "from BusLine";
		Query query = session.createQuery(hql);
		busLineList = query.list();
		session.close();
			
		return busLineList;
	}

	public List<BusStop> getLineStops(String lineId) {
		
		
		BusLine busLine = null;
		List<BusStop> busStops = new ArrayList<BusStop>(); 
		
		//try accessing the db
		Session session = sessionFactory.openSession();
		busLine = (BusLine) session.get(BusLine.class, lineId);
		for (BusStop busStop : busLine.getStops()) {
			busStops.add(busStop);
		}
		
		session.close();
			
		return busStops;
	}


}
