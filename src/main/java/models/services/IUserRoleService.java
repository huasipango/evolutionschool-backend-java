package models.services;

import models.entities.UserRole;

import java.util.List;

public interface IUserRoleService {

    public void save(UserRole userRole);

    public UserRole findById(Integer id);

    public void delete(Integer id);

    public List<UserRole> findAll();
}
