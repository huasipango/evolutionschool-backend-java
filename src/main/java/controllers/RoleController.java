package controllers;

import models.entities.Role;
import models.services.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value="/role")
public class RoleController {

    @Autowired
    //private IRoleDAO service;
    private IRoleService service;

    @GetMapping(value="/create" )
    public String create(Model model){
        Role role=new Role();
        model.addAttribute("role",role);
        return "role/form";
    }

    @PostMapping(value="/save" )
    public String save(Role role,Model model){
        try{
            service.save(role);
        }catch (Exception ex){
            model.addAttribute("error: ",ex.toString());
        }
        return "redirect:/role/list";
    }

    @GetMapping(value="/retrieve/{id}" )
    public String retrieve(@PathVariable(value = "id") Integer id,
                           Model model){
        Role role=service.findById(id);
        model.addAttribute("role",role);
        return "role/card";
    }

    @GetMapping(value="/update/{id}" )
    public String update(@PathVariable(value = "id") Integer id,
                         Model model){
        Role role=service.findById(id);
        model.addAttribute("role",role);
        return "role/form";
    }

    @GetMapping(value="/delete" )
    public String delete(@PathVariable(value = "id") Integer id,
                         Model model){
        try{
            service.delete(id);
        }catch (Exception ex){
            model.addAttribute("error: ",ex.toString());
        }
        return "redirect:/role/list";
    }

    @GetMapping(value="/list" )
    public String list(Model model){
        List<Role> roles=service.findAll();
        model.addAttribute("lista",roles);
        return "role/list";
    }
}