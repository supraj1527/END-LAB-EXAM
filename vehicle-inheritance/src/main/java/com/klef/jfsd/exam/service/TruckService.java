package com.klef.jfsd.exam.service;

import com.klef.jfsd.exam.model.Truck;
import com.klef.jfsd.exam.repository.TruckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TruckService {
    @Autowired
    private TruckRepository truckRepository;

    public List<Truck> getAllTrucks() {
        return truckRepository.findAll();
    }

    public Truck saveTruck(Truck truck) {
        return truckRepository.save(truck);
    }
}
