package cst438.services;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import cst438.domain.*;
import cst438.repositories.CarRepository;
import cst438.repositories.ReservationRepository;

@Service
public class CarService {
	
	@Autowired
	private CarRepository carRepository;
	
	@Autowired
	private ReservationRepository reservationRepository;
	
	public Car getCar(int id) {
		List<Car> cars = carRepository.findById(id);
		Car car = cars.get(0);
		return new Car(car.getId(), car.getMake(), car.getModel(),car.getFuel(),
				car.getTransmission(),car.getYear(),
				car.getPrice(), car.getCity());
	}
	
	public List<Car> getCarById(int id) {
		
		return carRepository.findById(id);
		
	}
	
	public List<Car> getCarByCity(String city) {
		
		return carRepository.findByCity(city);
		
	}
	
	public List<Car> getAllCars() {
		
		return carRepository.findAll();
		
	}
	
	public List<Reservation> getReservationById(int id) {
		
		return reservationRepository.findById(id);
		
	}
	
	public List<Reservation> getReservation() {
		
		return reservationRepository.findAll();
		
	}

	
}
