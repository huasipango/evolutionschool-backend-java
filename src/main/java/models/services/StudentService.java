package models.services;

import models.dao.IStudentDAO;
import models.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {

    @Autowired
    private IStudentDAO dao;

    @Override
    public void save(Student student) {
        dao.save(student);
    }

    @Override
    public Student findById(Integer id) {
        return dao.findById(id).get();
    }

    @Override
    public void delete(Integer id) {
        dao.deleteById(id);
    }

    @Override
    public List<Student> findAll() {
        return (List<Student>) dao.findAll();
    }
}
