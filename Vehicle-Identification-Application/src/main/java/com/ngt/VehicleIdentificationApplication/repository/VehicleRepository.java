package com.ngt.VehicleIdentificationApplication.repository;

import com.ngt.VehicleIdentificationApplication.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}
