package models.dao;

import models.entities.Route;
import org.springframework.data.repository.CrudRepository;

public interface IRouteDAO extends CrudRepository<Route, Integer> {
}
