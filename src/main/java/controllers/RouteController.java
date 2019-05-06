package controllers;

import models.entities.Route;
import models.services.IRouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value="/route")
public class RouteController {

    @Autowired
    //private IRouteDAO service;
    private IRouteService service;

    @GetMapping(value="/create" )
    public String create(Model model){
        Route route=new Route();
        model.addAttribute("route",route);
        return "route/form";
    }

    @PostMapping(value="/save" )
    public String save(Route route,Model model){
        try{
            service.save(route);
        }catch (Exception ex){
            model.addAttribute("error: ",ex.toString());
        }
        return "redirect:/route/list";
    }

    @GetMapping(value="/retrieve/{id}" )
    public String retrieve(@PathVariable(value = "id") Integer id,
                           Model model){
        Route route=service.findById(id);
        model.addAttribute("route",route);
        return "route/card";
    }

    @GetMapping(value="/update/{id}" )
    public String update(@PathVariable(value = "id") Integer id,
                         Model model){
        Route route=service.findById(id);
        model.addAttribute("route",route);
        return "route/form";
    }

    @GetMapping(value="/delete/{id}" )
    public String delete(@PathVariable(value = "id") Integer id,
                         Model model){
        try{
            service.delete(id);
        }catch (Exception ex){
            model.addAttribute("error: ",ex.toString());
        }
        return "redirect:/route/list";
    }

    @GetMapping(value="/list" )
    public String list(Model model){
        List<Route> routes=service.findAll();
        model.addAttribute("lista",routes);
        return "route/list";
    }
}
