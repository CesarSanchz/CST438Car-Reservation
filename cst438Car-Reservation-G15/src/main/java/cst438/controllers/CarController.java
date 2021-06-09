package cst438.controllers;

import java.util.List;

import javax.validation.Valid;
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
		return "index";
	}
	
	//Page used to get all cars that are not reserved
	@GetMapping("/allCars")
	public String getAllCars(Model model) {
		List<Car> cars_list = CarRepository.findByPrice();
		model.addAttribute("Car", cars_list);		
		return "cars_list";
	}
	
	//Page to filter cars by City wanted by customer
	@PostMapping("/select_reservationByCity")
	public String getCarByCity(@RequestParam("city") String city, Model model ) {
		List<Car> cars = carService.getCarByCity(city);
		model.addAttribute("city", cars);
		return "reservation_page";
	}
		 

}
