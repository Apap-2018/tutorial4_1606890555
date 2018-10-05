package com.apap.tutorial4.service;

import java.util.List;

import com.apap.tutorial4.model.FlightModel;

public interface FlightService {
	FlightModel getFlight (Long id);
	void addFlight(FlightModel flight);
	void deleteFlight(Long id);
	List<FlightModel> getFlightList();
}
