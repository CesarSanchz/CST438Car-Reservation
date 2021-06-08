package cst438.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="reservations")

public class Reservation {
	
	@Id
	private int id;
	
	private int car_id;
	
	@NotNull
	@Size(min= 3, max=45)
	private String email;
	
	public Reservation () {
	}

	public Reservation(int id, int car_id, @NotNull @Size(min = 3, max = 45) String email) {
		super();
		this.id = id;
		this.car_id = car_id;
		this.email = email;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCar_id() {
		return car_id;
	}

	public void setCar_id(int car_id) {
		this.car_id = car_id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reservation other = (Reservation) obj;
		if (car_id != other.car_id)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Reservation [id=" + id + ", car_id=" + car_id + ", email=" + email + "]";
	}
	
	

}
