package controllers;

import models.entities.StudentTravel;
import models.services.IStudentTravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value="/studentTravel")
public class StudentTravelController {

    @Autowired
    //private IStudentTravelDAO service;
    private IStudentTravelService service;

    @GetMapping(value="/create" )
    public String create(Model model){
        StudentTravel studentTravel=new StudentTravel();
        model.addAttribute("studentTravel",studentTravel);
        return "studentTravel/form";
    }

    @PostMapping(value="/save" )
    public String save(StudentTravel studentTravel,Model model){
        try{
            service.save(studentTravel);
        }catch (Exception ex){
            model.addAttribute("error: ",ex.toString());
        }
        return "redirect:/studentTravel/list";
    }

    @GetMapping(value="/retrieve/{id}" )
    public String retrieve(@PathVariable(value = "id") Integer id,
                           Model model){
        StudentTravel studentTravel=service.findById(id);
        model.addAttribute("studentTravel",studentTravel);
        return "studentTravel/card";
    }

    @GetMapping(value="/update/{id}" )
    public String update(@PathVariable(value = "id") Integer id,
                         Model model){
        StudentTravel studentTravel=service.findById(id);
        model.addAttribute("studentTravel",studentTravel);
        return "studentTravel/form";
    }

    @GetMapping(value="/delete/{id}" )
    public String delete(@PathVariable(value = "id") Integer id,
                         Model model){
        try{
            service.delete(id);
        }catch (Exception ex){
            model.addAttribute("error: ",ex.toString());
        }
        return "redirect:/studentTravel/list";
    }

    @GetMapping(value="/list" )
    public String list(Model model){
        List<StudentTravel> studentTravels=service.findAll();
        model.addAttribute("lista",studentTravels);
        return "studentTravel/list";
    }
}
