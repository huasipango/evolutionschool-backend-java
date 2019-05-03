package models.services;

import models.dao.ILocationDAO;
import models.entities.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService implements ILocationService {

    @Autowired
    private ILocationDAO dao;

    @Override
    public void save(Location location) {
        dao.save(location);
    }

    @Override
    public Location findById(Integer id) {
        return dao.findById(id).get();
    }

    @Override
    public void delete(Integer id) {
        dao.deleteById(id);
    }

    @Override
    public List<Location> findAll() {
        return (List<Location>) dao.findAll();
    }
}
