package models.services;

import models.dao.IDriverDAO;
import models.entities.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverService implements IDriverService {

    @Autowired
    private IDriverDAO dao;

    @Override
    public void save(Driver driver) {
        dao.save(driver);
    }

    @Override
    public Driver findById(Integer id) {
        return dao.findById(id).get();
    }

    @Override
    public void delete(Integer id) {
        dao.deleteById(id);
    }

    @Override
    public List<Driver> findAll() {
        return (List<Driver>) dao.findAll();
    }
}
