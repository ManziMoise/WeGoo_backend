package com.example.WeGoo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.WeGoo.Domain.BusLocation;

@Repository
public interface BusLocationRepository extends JpaRepository<BusLocation, Integer> {

}
