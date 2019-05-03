package models.services;

import models.entities.StudentTravel;

import java.util.List;

public interface IStudentTravelService {

    public void save(StudentTravel studentTravel);

    public StudentTravel findById(Integer id);

    public void delete(Integer id);

    public List<StudentTravel> findAll();
}
