package com.iwax.taxi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iwax.taxi.model.Trip;

public interface TripRepository extends JpaRepository<Trip, Long> {

}
