/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.web.Dao.impl;

import com.cibt.web.Dao.GenericDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author anis
 */
public abstract class GenericDAOImpl<T> implements GenericDAO<T> {

    @Autowired
    protected JdbcTemplate jdbcTemplate;
}
