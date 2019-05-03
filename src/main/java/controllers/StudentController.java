package controllers;

import models.entities.Student;
import models.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value="/student")
public class StudentController {

    @Autowired
    //private IStudentDAO service;
    private IStudentService service;

    @GetMapping(value="/create" )
    public String create(Model model){
        Student student=new Student();
        model.addAttribute("student",student);
        return "student/form";
    }

    @PostMapping(value="/save" )
    public String save(Student student,Model model){
        try{
            service.save(student);
        }catch (Exception ex){
            model.addAttribute("error: ",ex.toString());
        }
        return "redirect:/student/list";
    }

    @GetMapping(value="/retrieve/{id}" )
    public String retrieve(@PathVariable(value = "id") Integer id,
                           Model model){
        Student student=service.findById(id);
        model.addAttribute("student",student);
        return "student/card";
    }

    @GetMapping(value="/update/{id}" )
    public String update(@PathVariable(value = "id") Integer id,
                         Model model){
        Student student=service.findById(id);
        model.addAttribute("student",student);
        return "student/form";
    }

    @GetMapping(value="/delete" )
    public String delete(@PathVariable(value = "id") Integer id,
                         Model model){
        try{
            service.delete(id);
        }catch (Exception ex){
            model.addAttribute("error: ",ex.toString());
        }
        return "redirect:/student/list";
    }

    @GetMapping(value="/list" )
    public String list(Model model){
        List<Student> students=service.findAll();
        model.addAttribute("lista",students);
        return "student/list";
    }
}
