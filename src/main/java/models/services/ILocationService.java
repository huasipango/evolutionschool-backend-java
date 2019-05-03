package models.services;

import models.entities.Location;

import java.util.List;

public interface ILocationService {

    public void save(Location location);

    public Location findById(Integer id);

    public void delete(Integer id);

    public List<Location> findAll();
}
