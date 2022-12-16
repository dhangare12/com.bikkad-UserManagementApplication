package com.BikkadIT.UserManagementApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.UserManagementApp.entities.City;
import com.BikkadIT.UserManagementApp.entities.Country;
import com.BikkadIT.UserManagementApp.entities.State;
import com.BikkadIT.UserManagementApp.repositories.CityRepository;
import com.BikkadIT.UserManagementApp.repositories.CountryRepository;
import com.BikkadIT.UserManagementApp.repositories.StateRepository;

@Service
public class UserServiceImpl implements UserServiceI{

	@Autowired
	private CountryRepository countryRepository;
	
	@Autowired
	private StateRepository stateRepository;
	
	@Autowired
	private CityRepository cityRepository;
	
	
	@Override
	public List<Country> getAllCountry() {
		List<Country> findAll = countryRepository.findAll();
		
		return findAll;
	}

	@Override
	public List<State> getAllState(int countryId) {
		 List<State> findByCountryId = stateRepository.findByCountryId(countryId);
		return findByCountryId;
	}

	@Override
	public List<City> getAllCity(int stateId) {
		List<City> findByStateId = cityRepository.findByStateId(stateId);
		return findByStateId;
	}

}
