/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flc.springbootcgm.controllers;

import ch.qos.logback.core.model.Model;
import flc.springbootcgm.models.SubscriptionUserModel;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.InternalResourceView;


@Controller
@RequestMapping("/user")
public class UserController {
    
 
    @GetMapping
    public ModelAndView readAll(@RequestParam(name ="firstname", required = false) String firstname,
                                @RequestParam(name ="age", required = false) String age) {
        
        List<String> users= new ArrayList<>();
        users.add("kenny");
        users.add("kayle");
        users.add("cartman");
        
        
        ModelAndView modelAndView = new ModelAndView("usersView");
        modelAndView.addObject("users", users);
        return modelAndView;
    }
    
    @GetMapping("/{firstname}")
    public ModelAndView readByFirstname(@PathVariable("firstname") String nome) {
        
        
        ModelAndView modelAndView = new ModelAndView("userView");
        modelAndView.addObject("firstname", nome);
        return modelAndView;
    }
    
    @PostMapping
    public ModelAndView create(@ModelAttribute SubscriptionUserModel subscriptionUserModel) {
        
 
        ModelAndView modelAndView = new ModelAndView("userView");
        //infatti su usersViews.jsp vi è la request dell'attributo firstname
        modelAndView.addObject("firstname",subscriptionUserModel.getFirstname());
        return modelAndView;
    }

    
    /*
    @GetMapping("/{firstname}")
    public View readByFirstname(@PathVariable("firstname") String nome, Model model) {
        
        model.addAttribute("firstname",nome);
       
        return new InternalResourceView("/WEB-INF/views/userViews.jsp");
    }
*/
}