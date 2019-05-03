package models.dao;

import models.entities.Location;
import org.springframework.data.repository.CrudRepository;

public interface ILocationDAO extends CrudRepository<Location, Integer> {
}
