package com.iwax.taxi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iwax.taxi.model.Driver;

public interface DriverRepository extends JpaRepository<Driver, Long> {

}
