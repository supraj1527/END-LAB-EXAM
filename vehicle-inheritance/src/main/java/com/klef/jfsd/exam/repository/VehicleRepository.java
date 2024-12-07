package com.klef.jfsd.exam.repository;

import com.klef.jfsd.exam.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {}
