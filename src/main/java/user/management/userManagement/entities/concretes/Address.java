package user.management.userManagement.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
 
@Table(name="addresses")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="openAddress")
	private String openAddress; 
	@OneToOne(mappedBy = "address")
	private Student student;
	
	public Address() {
		super();
	}

	public Address(int id, String openAddress, Student student) {
		super();
		this.id = id;
		this.openAddress = openAddress;
		this.student = student;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOpenAddress() {
		return openAddress;
	}

	public void setOpenAddress(String openAddress) {
		this.openAddress = openAddress;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	
}
