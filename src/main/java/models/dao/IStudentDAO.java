package models.dao;

import models.entities.Student;
import org.springframework.data.repository.CrudRepository;

public interface IStudentDAO extends CrudRepository<Student, Integer> {
}
