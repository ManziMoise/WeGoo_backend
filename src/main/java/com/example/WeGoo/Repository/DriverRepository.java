package com.example.WeGoo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.WeGoo.Domain.Driver;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Integer>{
	

}
