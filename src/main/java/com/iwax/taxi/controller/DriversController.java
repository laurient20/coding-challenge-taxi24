package com.iwax.taxi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.iwax.taxi.model.Driver;
import com.iwax.taxi.repositories.DriverRepository;

@RestController
@RequestMapping("/api/v1/drivers/")
public class DriversController {
	
	@Autowired
	private DriverRepository driverRepository;
	
	@GetMapping
	public List<Driver> list(){
		return driverRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Driver driver) {
		driverRepository.save(driver);
	}
	
	@GetMapping("/{id}")
	public Driver get(@PathVariable("id") Long id) {
		return driverRepository.findOne(id);
	}

}
