/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.web.controller;

import com.cibt.web.entity.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author anis
 */
@Controller
@RequestMapping(value = "/")
public class HomeController {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact/index";
    }

    @PostMapping("/contact")
    @ResponseBody
    public String contactPost(@ModelAttribute("contact") Contact contact,
            @RequestParam(value = "sendMe", required = false) boolean sendMe){
        
        String sql = "insert into contacts(name,email,subject,message,status)"
                + "values(?,?,?,?,?)";
        
        int result = jdbcTemplate.update(sql, new Object[]{
                        contact.getName(),
                        contact.getEmail(),
                        contact.getSubject(),
                        contact.getMessage(),
                        contact.isStatus()});
        
        String message = "<h1> Result::" +result;
        message +=(sendMe)?"<br> Send me is clicked":"<br> Send me is not clicked";
        return message + "</h1>";
        /*return "<h1>Name::" + name + "<br>" +
                "Email::" + email +"<br>" +
                "Subject::" + subject + "<br>" +
                "Message::" + message + "<br>" +
                "Send Me::" + sendMe + "</h1>" ;*/
    }
}
