package cst438.controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import cst438.domain.*;
import cst438.services.*;

@RestController
@RequestMapping("/api")
public class CarRestController {
	
	@Autowired
	CarService carService;
	
	@GetMapping("/getAllCars")
	public List<Car> getAllCars() {
		List<Car> cars = carService.getAllCars();
		return cars;
		
	}
	
	@GetMapping("/getCarById")
	  public List<Car> getCarById(@RequestParam("id") int id) {
	    List<Car> cars = carService.getCarById(id);
	    return cars;
	  }
	
	@GetMapping("/getCarByCity")
	  public List<Car> getCarByCity(@RequestParam("city") String city) {
	    List<Car> cars = carService.getCarByCity(city);
	    return cars;
	  }
	
	@GetMapping("/getReservation")
	  public List<Reservation> getReservation() {
	    List<Reservation> reservation = carService.getReservation();
	    return reservation;
	  }
	
	@GetMapping("/getReservationById")
	  public List<Reservation> getReservationById(@RequestParam("id") int id) {
	    List<Reservation> reservation = carService.getReservationById(id);
	    return reservation;
	  }
	
	//@GetMapping("/api/cars/{city}")
   // public ResponseEntity<Car> getWeather(@PathVariable("city") String city) {
  //      return carService.getCityInfo(city);
  //  }

}
