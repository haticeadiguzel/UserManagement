package user.management.userManagement.entities.concretes;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="schools")
@Data
@Entity
public class School {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Enumerated(EnumType.STRING)
	private TypeSchool schoolName;
	@OneToMany(mappedBy = "school")
	private List<Student> students;
}
