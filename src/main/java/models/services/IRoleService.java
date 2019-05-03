package models.services;

import models.entities.Role;
import models.entities.UserRole;

import java.util.List;

public interface IRoleService {

    public void save(Role role);

    public Role findById(Integer id);

    public void delete(Integer id);

    public List<Role> findAll();

}
