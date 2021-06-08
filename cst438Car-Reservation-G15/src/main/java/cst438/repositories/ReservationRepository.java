package cst438.repositories;

import java.util.ArrayList;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cst438.domain.*;

public interface ReservationRepository extends JpaRepository<Reservation, Long>{
	
	List<Reservation> findAll();
	
	
	//@Query(value = "SELECT * FROM Reservation WHERE id = ?1", nativeQuery = true)
	//List<Reservation> findById(int id);
	
	@Query(value = "SELECT * FROM Reservations WHERE id = ?1", nativeQuery = true)
    List<Reservation> findById(int id);

}
