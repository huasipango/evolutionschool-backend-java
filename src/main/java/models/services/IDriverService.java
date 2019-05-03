package models.services;

import models.entities.Driver;

import java.util.List;

public interface IDriverService {

    public void save(Driver driver);

    public Driver findById(Integer id);

    public void delete(Integer id);

    public List<Driver> findAll();

}
