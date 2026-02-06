package com.vehicle.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vehicle.service.model.Mechanic;

public interface MechanicRepo extends JpaRepository<Mechanic, Long> {
}
