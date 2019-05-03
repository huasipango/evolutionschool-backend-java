package models.services;

import models.dao.IUserRoleDAO;
import models.entities.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleService implements IUserRoleService {

    @Autowired
    private IUserRoleDAO dao;

    @Override
    public void save(UserRole userRole) {
        dao.save(userRole);
    }

    @Override
    public UserRole findById(Integer id) {
        return dao.findById(id).get();
    }

    @Override
    public void delete(Integer id) {
        dao.deleteById(id);
    }

    @Override
    public List<UserRole> findAll() {
        return (List<UserRole>) dao.findAll();
    }
}
