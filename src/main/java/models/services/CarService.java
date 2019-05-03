package models.services;

import models.dao.ICarDAO;
import models.entities.Car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService implements ICarService {
    @Autowired
    private ICarDAO dao;

    @Override
    public void save(Car car) {
        dao.save(car);
    }

    @Override
    public Car findById(Integer id) {
        return dao.findById(id).get();
    }

    @Override
    public void delete(Integer id) {
        dao.deleteById(id);
    }

    @Override
    public List<Car> findAll() {
        return (List<Car>) dao.findAll();
    }
}
