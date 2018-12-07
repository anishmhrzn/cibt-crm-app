/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.web.controller;

import com.cibt.web.Dao.CourseDAO;
import com.cibt.web.Dao.EnquiryDAO;
import com.cibt.web.entity.Course;
import com.cibt.web.entity.Enquiry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author anis
 */
@Controller
@RequestMapping(value = "/enquiry")
public class EnquiryController {
    @Autowired
    private EnquiryDAO enquiryDAO;
    @Autowired
    private CourseDAO courseDAO;
    
    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("courses" , courseDAO.getAll());
        return "enquiry/index";
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody String save(@ModelAttribute("Enquiry") Enquiry enquiry){
        int result =  enquiryDAO.insert(enquiry);
        return "Result::" + result;
    }
}
