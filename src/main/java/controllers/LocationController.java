package controllers;

import models.entities.Location;
import models.services.ILocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value="/location")
public class LocationController {

    @Autowired
    //private ILocationDAO service;
    private ILocationService service;

    @GetMapping(value="/create" )
    public String create(Model model){
        Location location=new Location();
        model.addAttribute("location",location);
        return "location/form";
    }

    @PostMapping(value="/save" )
    public String save(Location location,Model model){
        try{
            service.save(location);
        }catch (Exception ex){
            model.addAttribute("error: ",ex.toString());
        }
        return "redirect:/location/list";
    }

    @GetMapping(value="/retrieve/{id}" )
    public String retrieve(@PathVariable(value = "id") Integer id,
                           Model model){
        Location location=service.findById(id);
        model.addAttribute("location",location);
        return "location/card";
    }

    @GetMapping(value="/update/{id}" )
    public String update(@PathVariable(value = "id") Integer id,
                         Model model){
        Location location=service.findById(id);
        model.addAttribute("location",location);
        return "location/form";
    }

    @GetMapping(value="/delete" )
    public String delete(@PathVariable(value = "id") Integer id,
                         Model model){
        try{
            service.delete(id);
        }catch (Exception ex){
            model.addAttribute("error: ",ex.toString());
        }
        return "redirect:/location/list";
    }

    @GetMapping(value="/list" )
    public String list(Model model){
        List<Location> locations=service.findAll();
        model.addAttribute("lista",locations);
        return "location/list";
    }
}
