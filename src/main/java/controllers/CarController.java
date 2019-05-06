package controllers;

import models.entities.Car;
import models.services.ICarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value="/car")
public class CarController {

    @Autowired
    //private ICarDAO service;
    private ICarService service;

    @GetMapping(value="/create" )
    public String create(Model model){
        Car car=new Car();
        model.addAttribute("car",car);
        return "car/form";
    }

    @PostMapping(value="/save" )
    public String save(Car car,Model model){
        try{
            service.save(car);
        }catch (Exception ex){
            model.addAttribute("error: ",ex.toString());
        }
        return "redirect:/car/list";
    }

    @GetMapping(value="/retrieve/{id}" )
    public String retrieve(@PathVariable(value = "id") Integer id,
                           Model model){
        Car car=service.findById(id);
        model.addAttribute("car",car);
        return "car/card";
    }

    @GetMapping(value="/update/{id}" )
    public String update(@PathVariable(value = "id") Integer id,
                         Model model){
        Car car=service.findById(id);
        model.addAttribute("car",car);
        return "car/form";
    }

    @GetMapping(value="/delete/{id}" )
    public String delete(@PathVariable(value = "id") Integer id,
                         Model model){
        try{
            service.delete(id);
        }catch (Exception ex){
            model.addAttribute("error: ",ex.toString());
        }
        return "redirect:/car/list";
    }

    @GetMapping(value="/list" )
    public String list(Model model){
        List<Car> cars=service.findAll();
        model.addAttribute("lista",cars);
        return "car/list";
    }
}
