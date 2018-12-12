/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.web.service.impl;

import com.cibt.web.Dao.CourseDAO;
import com.cibt.web.Dao.EnquiryDAO;
import com.cibt.web.dto.EnquiryDTO;
import com.cibt.web.entity.Course;
import com.cibt.web.entity.Enquiry;
import com.cibt.web.service.EnquiryService;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author anis
 */
@Service
public class EnquiryServiceImpl implements EnquiryService {
    
    List<Course> courses = null;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private EnquiryDAO enquiryDAO;
    
    @Autowired
    private CourseDAO courseDAO;

    @Override
    public int insert(EnquiryDTO enquiryDTO) {
        return enquiryDAO.insert(modelMapper.map(enquiryDTO, Enquiry.class));
    }

    @Override
    public List<Course> getCourses() {
        if(courses == null){
            courses= courseDAO.getAll();
        }
        return courses;
    }


}
