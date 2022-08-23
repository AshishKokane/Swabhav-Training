package com.aurionpro.model;

public class Aircraft implements AircraftColleague {
	private AircraftMediator mediator;
	private String flightName;

	public Aircraft(AircraftMediator mediator, String flightName) {
		this.mediator = mediator;
		this.flightName = flightName;
	}

	@Override
	public void startLanding() {
		String runway = this.mediator.allotRunwayTo(this);
		if (runway == null) {
			// informing passengers
			System.out.println("Due to traffic, there's a delay in landing of " + this.flightName);
		} else {
			System.out.println("Currently landing " + this.flightName + " on " + runway);
		}
	}

	@Override
	public void finishLanding() {
		System.out.println(this.flightName + "landed successfully");
		this.mediator.releaseRunwayOccupiedBy(this);
	}
}