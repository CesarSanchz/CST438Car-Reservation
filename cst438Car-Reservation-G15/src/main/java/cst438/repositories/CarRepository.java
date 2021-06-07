package cst438.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cst438.domain.*;

public interface CarRepository extends JpaRepository<Car, Long>{
	
	List<Car> findAll();
	
	@Query("SELECT c FROM Car c ORDER BY price")
	List<Car> findByPrice();
    
    List<Car> findById(int id);

}
