package models.dao;

import models.entities.Car;
import org.springframework.data.repository.CrudRepository;

public interface ICarDAO extends CrudRepository<Car, Integer> {
}
