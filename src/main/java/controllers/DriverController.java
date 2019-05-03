package controllers;

import models.entities.Driver;
import models.services.IDriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value="/driver")
public class DriverController {

    @Autowired
    //private IDriverDAO service;
    private IDriverService service;

    @GetMapping(value="/create" )
    public String create(Model model){
        Driver driver=new Driver();
        model.addAttribute("driver",driver);
        return "driver/form";
    }

    @PostMapping(value="/save" )
    public String save(Driver driver,Model model){
        try{
            service.save(driver);
        }catch (Exception ex){
            model.addAttribute("error: ",ex.toString());
        }
        return "redirect:/driver/list";
    }

    @GetMapping(value="/retrieve/{id}" )
    public String retrieve(@PathVariable(value = "id") Integer id,
                           Model model){
        Driver driver=service.findById(id);
        model.addAttribute("driver",driver);
        return "driver/card";
    }

    @GetMapping(value="/update/{id}" )
    public String update(@PathVariable(value = "id") Integer id,
                         Model model){
        Driver driver=service.findById(id);
        model.addAttribute("driver",driver);
        return "driver/form";
    }

    @GetMapping(value="/delete" )
    public String delete(@PathVariable(value = "id") Integer id,
                         Model model){
        try{
            service.delete(id);
        }catch (Exception ex){
            model.addAttribute("error: ",ex.toString());
        }
        return "redirect:/driver/list";
    }

    @GetMapping(value="/list" )
    public String list(Model model){
        List<Driver> drivers=service.findAll();
        model.addAttribute("lista",drivers);
        return "driver/list";
    }
}
