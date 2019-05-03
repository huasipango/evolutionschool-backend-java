package controllers;

import models.entities.Travel;
import models.services.ITravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value="/travel")
public class TravelController {

    @Autowired
    //private ITravelDAO service;
    private ITravelService service;

    @GetMapping(value="/create" )
    public String create(Model model){
        Travel travel=new Travel();
        model.addAttribute("travel",travel);
        return "travel/form";
    }

    @PostMapping(value="/save" )
    public String save(Travel travel,Model model){
        try{
            service.save(travel);
        }catch (Exception ex){
            model.addAttribute("error: ",ex.toString());
        }
        return "redirect:/travel/list";
    }

    @GetMapping(value="/retrieve/{id}" )
    public String retrieve(@PathVariable(value = "id") Integer id,
                           Model model){
        Travel travel=service.findById(id);
        model.addAttribute("travel",travel);
        return "travel/card";
    }

    @GetMapping(value="/update/{id}" )
    public String update(@PathVariable(value = "id") Integer id,
                         Model model){
        Travel travel=service.findById(id);
        model.addAttribute("travel",travel);
        return "travel/form";
    }

    @GetMapping(value="/delete" )
    public String delete(@PathVariable(value = "id") Integer id,
                         Model model){
        try{
            service.delete(id);
        }catch (Exception ex){
            model.addAttribute("error: ",ex.toString());
        }
        return "redirect:/travel/list";
    }

    @GetMapping(value="/list" )
    public String list(Model model){
        List<Travel> travels=service.findAll();
        model.addAttribute("lista",travels);
        return "travel/list";
    }
}
