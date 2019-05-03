package models.services;

import models.dao.IFatherDAO;
import models.entities.Father;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FatherService implements IFatherService {

    @Autowired
    private IFatherDAO dao;

    @Override
    public void save(Father father) {
        dao.save(father);
    }

    @Override
    public Father findById(Integer id) {
        return dao.findById(id).get();
    }

    @Override
    public void delete(Integer id) {
        dao.deleteById(id);
    }

    @Override
    public List<Father> findAll() {
        return (List<Father>) dao.findAll();
    }
}
