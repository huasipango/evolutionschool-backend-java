package models.dao;

import models.entities.Driver;
import org.springframework.data.repository.CrudRepository;

public interface IDriverDAO extends CrudRepository<Driver, Integer> {
}
