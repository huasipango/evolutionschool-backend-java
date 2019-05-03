package models.services;

import models.entities.Absense;

import java.util.List;

public interface IAbsenseService {

    public void save(Absense absense);

    public Absense findById(Integer id);

    public void delete(Integer id);

    public List<Absense> findAll();
}
