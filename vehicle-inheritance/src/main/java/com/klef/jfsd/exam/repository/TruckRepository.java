package com.klef.jfsd.exam.repository;

import com.klef.jfsd.exam.model.Truck;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TruckRepository extends JpaRepository<Truck, Long> {}
