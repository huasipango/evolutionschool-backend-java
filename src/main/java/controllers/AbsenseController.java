package controllers;

import models.entities.Absense;
import models.services.IAbsenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value="/absense")
public class AbsenseController {

    @Autowired
    //private IAbsenseDAO service;
    private IAbsenseService service;

    @GetMapping(value="/create" )
    public String create(Model model){
        Absense absense=new Absense();
        model.addAttribute("absense",absense);
        return "absense/form";
    }

    @PostMapping(value="/save" )
    public String save(Absense absense,Model model){
        try{
            service.save(absense);
        }catch (Exception ex){
            model.addAttribute("error: ",ex.toString());
        }
        return "redirect:/absense/list";
    }

    @GetMapping(value="/retrieve/{id}" )
    public String retrieve(@PathVariable(value = "id") Integer id,
                           Model model){
        Absense absense=service.findById(id);
        model.addAttribute("absense",absense);
        return "absense/card";
    }

    @GetMapping(value="/update/{id}" )
    public String update(@PathVariable(value = "id") Integer id,
                         Model model){
        Absense absense=service.findById(id);
        model.addAttribute("absense",absense);
        return "absense/form";
    }

    @GetMapping(value="/delete" )
    public String delete(@PathVariable(value = "id") Integer id,
                         Model model){
        try{
            service.delete(id);
        }catch (Exception ex){
            model.addAttribute("error: ",ex.toString());
        }
        return "redirect:/absense/list";
    }

    @GetMapping(value="/list" )
    public String list(Model model){
        List<Absense> absenses=service.findAll();
        model.addAttribute("lista",absenses);
        return "absense/list";
    }
}
