package models.services;

import models.entities.Travel;

import java.util.List;

public interface ITravelService {

    public void save(Travel travel);

    public Travel findById(Integer id);

    public void delete(Integer id);

    public List<Travel> findAll();
}
