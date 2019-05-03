package models.services;

import models.dao.IAbsenseDAO;
import models.entities.Absense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AbsenseService implements IAbsenseService {
    @Autowired
    private IAbsenseDAO dao;

    @Override
    public void save(Absense absense) {
        dao.save(absense);
    }

    @Override
    public Absense findById(Integer id) {
        return dao.findById(id).get();
    }

    @Override
    public void delete(Integer id) {
        dao.deleteById(id);
    }

    @Override
    public List<Absense> findAll() {
        return (List<Absense>) dao.findAll();
    }
}
