package com.example.WeGoo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.WeGoo.Domain.Bus;

@Repository
public interface BusRepository extends JpaRepository<Bus, Integer> {

}
