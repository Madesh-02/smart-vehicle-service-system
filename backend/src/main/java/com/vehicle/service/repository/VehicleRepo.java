package com.vehicle.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vehicle.service.model.Vehicle;

public interface VehicleRepo extends JpaRepository<Vehicle, Long> {
}
