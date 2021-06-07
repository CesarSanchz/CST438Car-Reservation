package cst438.services;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import cst438.domain.*;
import cst438.repositories.CarRepository;

@Service
public class CarService {
	
	@Autowired
	private CarRepository carRepository;
	
	public Car getCar(int id) {
		List<Car> cars = carRepository.findById(id);
		Car car = cars.get(0);
		return new Car(car.getId(), car.getMake(), car.getModel(),car.getFuel(),
				car.getTransmission(),car.getYear(),
				car.getPrice());
	}
	

}
