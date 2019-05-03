package models.dao;

import models.entities.School;
import org.springframework.data.repository.CrudRepository;

public interface ISchoolDAO extends CrudRepository<School, Integer> {
}
