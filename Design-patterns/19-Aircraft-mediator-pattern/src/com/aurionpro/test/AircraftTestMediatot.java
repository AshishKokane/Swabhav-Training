package com.aurionpro.test;

import com.aurionpro.model.AircraftTrafficControlRoom;
import com.aurionpro.model.Aircraft;
import com.aurionpro.model.AircraftColleague;
import com.aurionpro.model.AircraftMediator;
import com.aurionpro.model.Runway;

public class AircraftTestMediatot {

	public static void main(String[] args) {

		Runway runwayA = new Runway("Runway A");
		Runway runwayb = new Runway("Runway B");
		AircraftMediator mediator = new AircraftTrafficControlRoom();
		mediator.registerRunway(runwayA);
		mediator.registerRunway(runwayb);
		AircraftColleague wrightFlight = new Aircraft(mediator, "Wright Flight");
		AircraftColleague airbusA380 = new Aircraft(mediator, "Airbus A380");
		wrightFlight.startLanding();
		airbusA380.startLanding();
		wrightFlight.finishLanding();
		airbusA380.startLanding();
	}

}
