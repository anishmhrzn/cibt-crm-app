/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.web.service;

import com.cibt.web.dto.EnquiryDTO;
import com.cibt.web.entity.Course;
import com.cibt.web.entity.Enquiry;
import java.util.List;

/**
 *
 * @author anis
 */
public interface EnquiryService {

    int insert(EnquiryDTO enquiryDTO);

    List<Course> getCourses();
}
