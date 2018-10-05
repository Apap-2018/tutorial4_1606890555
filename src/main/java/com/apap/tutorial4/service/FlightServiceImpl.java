package com.apap.tutorial4.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apap.tutorial4.model.FlightModel;
import com.apap.tutorial4.repository.FlightDB;

@Service
@Transactional
public class FlightServiceImpl implements FlightService {
	@Autowired
	private FlightDB flightDB;
	
	@Override
	public void addFlight(FlightModel flight) {
		flightDB.save(flight);
	}
	
	@Override
	public void deleteFlight(Long id) {
		flightDB.deleteById(id);
	}
	
	@Override
	public FlightModel getFlight (Long id){
		return flightDB.getOne(id);
	}

	@Override
	public List<FlightModel> getFlightList() {
		return flightDB.findAll();
	}


}
