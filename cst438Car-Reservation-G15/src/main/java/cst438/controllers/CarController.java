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
	
	@GetMapping("/allCars")
	public String getAllCars(Model model) {
		List<Car> cars_list = CarRepository.findByPrice();
		model.addAttribute("Car", cars_list);
		
		return "cars_list";
		
	}
	

}
