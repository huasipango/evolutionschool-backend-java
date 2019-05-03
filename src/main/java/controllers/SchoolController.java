package controllers;

import models.entities.School;
import models.services.ISchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value="/school")
public class SchoolController {

    @Autowired
    //private ISchoolDAO service;
    private ISchoolService service;

    @GetMapping(value="/create" )
    public String create(Model model){
        School school=new School();
        model.addAttribute("school",school);
        return "school/form";
    }

    @PostMapping(value="/save" )
    public String save(School school,Model model){
        try{
            service.save(school);
        }catch (Exception ex){
            model.addAttribute("error: ",ex.toString());
        }
        return "redirect:/school/list";
    }

    @GetMapping(value="/retrieve/{id}" )
    public String retrieve(@PathVariable(value = "id") Integer id,
                           Model model){
        School school=service.findById(id);
        model.addAttribute("school",school);
        return "school/card";
    }

    @GetMapping(value="/update/{id}" )
    public String update(@PathVariable(value = "id") Integer id,
                         Model model){
        School school=service.findById(id);
        model.addAttribute("school",school);
        return "school/form";
    }

    @GetMapping(value="/delete" )
    public String delete(@PathVariable(value = "id") Integer id,
                         Model model){
        try{
            service.delete(id);
        }catch (Exception ex){
            model.addAttribute("error: ",ex.toString());
        }
        return "redirect:/school/list";
    }

    @GetMapping(value="/list" )
    public String list(Model model){
        List<School> schools=service.findAll();
        model.addAttribute("lista",schools);
        return "school/list";
    }
}
