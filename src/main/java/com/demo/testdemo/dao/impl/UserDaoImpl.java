package com.demo.testdemo.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

import com.demo.testdemo.dao.UserDao;
import com.demo.testdemo.model.UserDetailsModel;

import jakarta.annotation.PostConstruct;

@Repository
public class UserDaoImpl extends JdbcDaoSupport implements UserDao {

    @Autowired
    DataSource dataSource;

    @PostConstruct
    private void initDataSourseTag() {
        setDataSource(dataSource);
    }

    @Override
    public UserDetailsModel getUserDetailsModel(String userName, String password) {
       
         String str = "select * from userEmp where FirstName = " + "'" + userName + "'" + " and Passwords = " + "'"
                + password + "'";
        System.out.println(str);
        try {
            return getJdbcTemplate().queryForObject(str, new RowMapper<UserDetailsModel>() {
                @Override
                @Nullable
                public UserDetailsModel mapRow(ResultSet rs, int rowNum) throws SQLException {
                    UserDetailsModel userDetailsModel = new UserDetailsModel();
                    userDetailsModel.setAddress(rs.getString("Address"));
                    userDetailsModel.setAge(rs.getInt("age"));
                    userDetailsModel.setLastName(rs.getString("LastName"));
                    userDetailsModel.setFirstName(rs.getString("FirstName"));
                    return userDetailsModel;
                }
            });

        } catch (Exception exception) {
            return null;
        }

    }

}
