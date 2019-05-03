package models.services;

import models.dao.IStudentTravelDAO;
import models.entities.StudentTravel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentTravelService implements IStudentTravelService {
    @Autowired
    private IStudentTravelDAO dao;

    @Override
    public void save(StudentTravel studentTravel) {
        dao.save(studentTravel);
    }

    @Override
    public StudentTravel findById(Integer id) {
        return dao.findById(id).get();
    }

    @Override
    public void delete(Integer id) {
        dao.deleteById(id);
    }

    @Override
    public List<StudentTravel> findAll() {
        return (List<StudentTravel>) dao.findAll();
    }
}
