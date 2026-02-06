package com.vehicle.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vehicle.service.model.Booking;

public interface BookingRepo extends JpaRepository<Booking, Long> {
}
