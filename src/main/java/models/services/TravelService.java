package models.services;

import models.dao.ITravelDAO;
import models.entities.Travel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravelService implements ITravelService {
    @Autowired
    private ITravelDAO dao;

    @Override
    public void save(Travel travel) {
        dao.save(travel);
    }

    @Override
    public Travel findById(Integer id) {
        return dao.findById(id).get();
    }

    @Override
    public void delete(Integer id) {
        dao.deleteById(id);
    }

    @Override
    public List<Travel> findAll() {
        return (List<Travel>) dao.findAll();
    }}
