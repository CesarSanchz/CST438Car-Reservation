package cst438.controllers;

import java.text.ParseException;
import java.util.List;

import javax.validation.Valid;

import org.apache.juli.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import cst438.domain.*;
import cst438.services.*;
import cst438.repositories.CarRepository;

@Controller
public class CarController {
	
	@Autowired
	private CarRepository CarRepository;
	
	@Autowired
	CarService carService;
	
	
	//Landing page
	@GetMapping("/")
	public String getIndex(Model model) {
		System.out.append("THIS ONE WORKS INDEX" );
		return "index";
	}
	
	//Page used to get all cars that are not reserved
	@GetMapping("/allCars")
	public String getAllCars(Model model) {
		List<Car> cars_list = CarRepository.findByPrice();
		model.addAttribute("Car", cars_list);	
		System.out.append("THIS ONE WORKS ALL CARS");
		return "cars_list";
	}
/*	
	//Page to filter cars by City wanted by customer
	@PostMapping("/select_reservationByCity")
	public String getCarByCity(@RequestParam("city") String city, Model model )throws ParseException {
		List<Car> cars = CarRepository.findByCity(city.toString());
		model.addAttribute("city", cars);
		System.out.append("THIS ONE WORKS RESERVE BY CITY ");
		return "reservation_page";
	}
*/	
	@GetMapping("/hello")
	public String getCarByCity(@RequestParam("name") String name, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("time", new java.util.Date().toString());
		return "index1";
	}
	
	

}
