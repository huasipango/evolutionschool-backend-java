package models.services;

import models.entities.Car;

import java.util.List;

public interface ICarService {

    public void save(Car car);

    public Car findById(Integer id);

    public void delete(Integer id);

    public List<Car> findAll();
    
}
