package user.management.userManagement.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import user.management.userManagement.entities.concretes.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
}
