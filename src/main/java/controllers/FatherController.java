package controllers;

import models.entities.Father;
import models.services.IFatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value="/father")
public class FatherController {

    @Autowired
    //private IFatherDAO service;
    private IFatherService service;

    @GetMapping(value="/create" )
    public String create(Model model){
        Father father=new Father();
        model.addAttribute("father",father);
        return "father/form";
    }

    @PostMapping(value="/save" )
    public String save(Father father,Model model){
        try{
            service.save(father);
        }catch (Exception ex){
            model.addAttribute("error: ",ex.toString());
        }
        return "redirect:/father/list";
    }

    @GetMapping(value="/retrieve/{id}" )
    public String retrieve(@PathVariable(value = "id") Integer id,
                           Model model){
        Father father=service.findById(id);
        model.addAttribute("father",father);
        return "father/card";
    }

    @GetMapping(value="/update/{id}" )
    public String update(@PathVariable(value = "id") Integer id,
                         Model model){
        Father father=service.findById(id);
        model.addAttribute("father",father);
        return "father/form";
    }

    @GetMapping(value="/delete" )
    public String delete(@PathVariable(value = "id") Integer id,
                         Model model){
        try{
            service.delete(id);
        }catch (Exception ex){
            model.addAttribute("error: ",ex.toString());
        }
        return "redirect:/father/list";
    }

    @GetMapping(value="/list" )
    public String list(Model model){
        List<Father> fathers=service.findAll();
        model.addAttribute("lista",fathers);
        return "father/list";
    }
}
