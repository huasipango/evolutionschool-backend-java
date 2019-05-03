package models.services;

import models.dao.IRoleDAO;
import models.entities.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService implements IRoleService {

    @Autowired
    private IRoleDAO dao;

    @Override
    public void save(Role role) {
        dao.save(role);
    }

    @Override
    public Role findById(Integer id) {
        return dao.findById(id).get();
    }

    @Override
    public void delete(Integer id) {
        dao.deleteById(id);
    }

    @Override
    public List<Role> findAll() {
        return (List<Role>) dao.findAll();
    }
}
