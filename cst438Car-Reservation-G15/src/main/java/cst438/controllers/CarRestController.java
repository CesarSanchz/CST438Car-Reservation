package cst438.controllers;

import java.util.ArrayList;
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
	
	//@GetMapping("/api/cars/{city}")
   // public ResponseEntity<Car> getWeather(@PathVariable("city") String city) {
  //      return carService.getCityInfo(city);
  //  }

}
