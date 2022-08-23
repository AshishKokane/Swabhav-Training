package com.aurionpro.model;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class AircraftTrafficControlRoom implements AircraftMediator {

	private LinkedList<Runway> availableRunways = new LinkedList<>();
	private Map<Aircraft,Runway> aircraftRunwayMap = new HashMap<>();
	public Runway runway1;

	@Override
	public void registerRunway(Runway runway) {
		this.availableRunways.add(runway);
		runway1 = runway;
	}

	@Override
	public String allotRunwayTo(Aircraft aircraft) {
		Runway nextAvailbleRunway = null;
		if (!this.availableRunways.isEmpty()) {
			nextAvailbleRunway = this.availableRunways.removeFirst();
			this.aircraftRunwayMap.put(aircraft, runway1);
		}
		return nextAvailbleRunway == null ? null : nextAvailbleRunway.getName();
	}

	@Override
	public void releaseRunwayOccupiedBy(Aircraft aircraft) {
		if (this.aircraftRunwayMap.containsKey(aircraft)) {
			Runway runway = this.aircraftRunwayMap.remove(aircraft);
			this.availableRunways.add(runway);
		}
	}
}
