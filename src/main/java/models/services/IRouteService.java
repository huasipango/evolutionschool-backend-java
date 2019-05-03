package models.services;

import models.entities.Route;

import java.util.List;

public interface IRouteService {

    public void save(Route route);

    public Route findById(Integer id);

    public void delete(Integer id);

    public List<Route> findAll();
}
