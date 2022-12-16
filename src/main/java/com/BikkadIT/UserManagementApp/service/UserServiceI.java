package com.BikkadIT.UserManagementApp.service;

import java.util.List;

import com.BikkadIT.UserManagementApp.entities.City;
import com.BikkadIT.UserManagementApp.entities.Country;
import com.BikkadIT.UserManagementApp.entities.State;

public interface UserServiceI {

	
	public List<Country> getAllCountry();
	
	public List<State> getAllState(int countryId);
	
	public List<City> getAllCity(int stateId);
	}
	

