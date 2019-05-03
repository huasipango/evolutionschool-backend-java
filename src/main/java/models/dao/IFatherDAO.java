package models.dao;

import models.entities.Father;
import org.springframework.data.repository.CrudRepository;

public interface IFatherDAO extends CrudRepository<Father, Integer> {
}
