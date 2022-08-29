package com.example.WeGoo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.WeGoo.Domain.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer>{

}
