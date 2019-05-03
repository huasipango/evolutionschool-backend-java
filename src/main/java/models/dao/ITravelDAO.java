package models.dao;

import models.entities.Travel;
import org.springframework.data.repository.CrudRepository;

public interface ITravelDAO extends CrudRepository<Travel, Integer> {
}
