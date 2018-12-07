/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.web.Dao.impl;

import com.cibt.web.Dao.CourseDAO;
import com.cibt.web.entity.Course;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author anis
 */
@Repository
public class CourseDAOImpl extends GenericDAOImpl<Course> implements CourseDAO {

    @Override
    public List<Course> getAll() {
        return jdbcTemplate.query("select * from courses", new RowMapper<Course>() {
            @Override
            public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
                return new Course()
                        .setId(rs.getInt("id"))
                        .setName(rs.getString("name"))
                        .setCode(rs.getString("code"))
                        .setFees(rs.getInt("fees"))
                        .setAddedDate(rs.getDate("added_date"))
                        .setModifiedDate(rs.getDate("modified_date"))
                        .setStatus(true);
            }
        });
    }

    @Override
    public int insert(Course model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
