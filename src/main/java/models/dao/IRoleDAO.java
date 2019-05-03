package models.dao;

import models.entities.Role;
import org.springframework.data.repository.CrudRepository;

public interface IRoleDAO extends CrudRepository<Role, Integer> {
}
