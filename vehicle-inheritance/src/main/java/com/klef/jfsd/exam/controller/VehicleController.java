package com.klef.jfsd.exam.controller;

import com.klef.jfsd.exam.model.Car;
import com.klef.jfsd.exam.model.Truck;
import com.klef.jfsd.exam.model.Vehicle;
import com.klef.jfsd.exam.service.CarService;
import com.klef.jfsd.exam.service.TruckService;
import com.klef.jfsd.exam.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @Autowired
    private CarService carService;

    @Autowired
    private TruckService truckService;

    // Retrieve all vehicles
    @GetMapping
    public List<Vehicle> getAllVehicles() {
        return vehicleService.getAllVehicles();
    }

    // Add a new car
    @PostMapping("/car")
    public Car saveCar(@RequestBody Car car) {
        return carService.saveCar(car);
    }

    // Add a new truck
    @PostMapping("/truck")
    public Truck saveTruck(@RequestBody Truck truck) {
        return truckService.saveTruck(truck);
    }
}
