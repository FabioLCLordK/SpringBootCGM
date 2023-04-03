/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flc.springbootcgm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.InternalResourceView;


@Controller
@RequestMapping("/")    // base url
public class HomeController {
    
    @GetMapping
    public ModelAndView getHomePage() {
        ModelAndView modelAndView = new ModelAndView("indexView");
        return modelAndView;
    }
    
    
    /*
    //cerca la risorsa direttamente lato "interno"
    @GetMapping
    public View getHomePage() {
        ModelAndView modelAndView = new ModelAndView("indexView");
        return new InternalResourceView("/WEB-INF/views/indexView.jsp");
    }
    */
}

