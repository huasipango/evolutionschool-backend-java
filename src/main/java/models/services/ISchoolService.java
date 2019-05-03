package models.services;

import models.entities.School;

import java.util.List;

public interface ISchoolService {

    public void save(School school);

    public School findById(Integer id);

    public void delete(Integer id);

    public List<School> findAll();
}
