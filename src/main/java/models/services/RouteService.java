package models.services;

import models.dao.IRouteDAO;
import models.entities.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteService implements IRouteService {
    @Autowired
    private IRouteDAO dao;

    @Override
    public void save(Route route) {
        dao.save(route);
    }

    @Override
    public Route findById(Integer id) {
        return dao.findById(id).get();
    }

    @Override
    public void delete(Integer id) {
        dao.deleteById(id);
    }

    @Override
    public List<Route> findAll() {
        return (List<Route>) dao.findAll();
    }
}
