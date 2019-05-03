package models.services;

import models.entities.Father;

import java.util.List;

public interface IFatherService {

    public void save(Father father);

    public Father findById(Integer id);

    public void delete(Integer id);

    public List<Father> findAll();
}
