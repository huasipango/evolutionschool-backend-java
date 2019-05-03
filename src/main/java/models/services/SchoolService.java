package models.services;

import models.dao.ISchoolDAO;
import models.entities.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService implements ISchoolService {

    @Autowired
    private ISchoolDAO dao;

    @Override
    public void save(School school) {
        dao.save(school);
    }

    @Override
    public School findById(Integer id) {
        return dao.findById(id).get();
    }

    @Override
    public void delete(Integer id) {
        dao.deleteById(id);
    }

    @Override
    public List<School> findAll() {
        return (List<School>) dao.findAll();
    }
}
