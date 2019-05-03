package models.dao;

import models.entities.Student;
import models.entities.StudentTravel;
import org.springframework.data.repository.CrudRepository;

public interface IStudentTravelDAO extends CrudRepository<StudentTravel, Integer> {
}
