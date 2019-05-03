package models.dao;

import models.entities.UserRole;
import org.springframework.data.repository.CrudRepository;

public interface IUserRoleDAO extends CrudRepository<UserRole, Integer> {
}
