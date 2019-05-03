package models.dao;

import models.entities.Absense;
import org.springframework.data.repository.CrudRepository;

public interface IAbsenseDAO extends CrudRepository<Absense, Integer> {
}
