package models.services;

import models.entities.Student;

import java.util.List;

public interface IStudentService {

    public void save(Student student);

    public Student findById(Integer id);

    public void delete(Integer id);

    public List<Student> findAll();
}
