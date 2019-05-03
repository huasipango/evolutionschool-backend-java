package controllers;

import models.entities.UserRole;
import models.services.IUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value="/userRole")
public class UserRoleController {

    @Autowired
    //private IUserRoleDAO service;
    private IUserRoleService service;

    @GetMapping(value="/create" )
    public String create(Model model){
        UserRole userRole=new UserRole();
        model.addAttribute("userRole",userRole);
        return "userRole/form";
    }

    @PostMapping(value="/save" )
    public String save(UserRole userRole,Model model){
        try{
            service.save(userRole);
        }catch (Exception ex){
            model.addAttribute("error: ",ex.toString());
        }
        return "redirect:/userRole/list";
    }

    @GetMapping(value="/retrieve/{id}" )
    public String retrieve(@PathVariable(value = "id") Integer id,
                           Model model){
        UserRole userRole=service.findById(id);
        model.addAttribute("userRole",userRole);
        return "userRole/card";
    }

    @GetMapping(value="/update/{id}" )
    public String update(@PathVariable(value = "id") Integer id,
                         Model model){
        UserRole userRole=service.findById(id);
        model.addAttribute("userRole",userRole);
        return "userRole/form";
    }

    @GetMapping(value="/delete" )
    public String delete(@PathVariable(value = "id") Integer id,
                         Model model){
        try{
            service.delete(id);
        }catch (Exception ex){
            model.addAttribute("error: ",ex.toString());
        }
        return "redirect:/userRole/list";
    }

    @GetMapping(value="/list" )
    public String list(Model model){
        List<UserRole> userRoles=service.findAll();
        model.addAttribute("lista",userRoles);
        return "userRole/list";
    }
}