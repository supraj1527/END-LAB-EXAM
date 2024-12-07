package com.klef.jfsd.exam.repository;

import com.klef.jfsd.exam.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {}
