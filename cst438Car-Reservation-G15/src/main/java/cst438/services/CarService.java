package cst438.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

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
				car.getPrice(), car.getCity());
	}
	
	
	//public ResponseEntity<Car> getCityInfo(String city) {
        // look up city info from database. Might be multiple cities with same name.
    //    List<Car> cityCars = carRepository.findByCity(city);
    //      
    //    return new ResponseEntity<Car>(cityCars, HttpStatus.OK);
	//}

	
}
