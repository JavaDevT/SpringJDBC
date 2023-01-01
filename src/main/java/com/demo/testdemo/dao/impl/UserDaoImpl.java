package com.demo.testdemo.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
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
        // String str = "select cast(aes_decrypt(unhex(`user_pswd`),'secret') as
        // char(50)) as user_pswd from user where user_id=?";
        String str = "select from userdetails where userName= ?  AND password = ?";
        return getJdbcTemplate().queryForObject(str, new Object[] { userName, password },
                new RowMapper<UserDetailsModel>() {

                    @Override
                    public UserDetailsModel mapRow(ResultSet rs, int rowCount) throws SQLException {
                        if (rowCount > 0) {
                            UserDetailsModel userDetailsModel = new UserDetailsModel();
                            userDetailsModel.setAddress(rs.getString("address"));
                            userDetailsModel.setAge(rs.getInt("age"));
                            userDetailsModel.setPhoneNumber(rs.getString("phonenumber"));
                            userDetailsModel.setUserName(rs.getString("name"));
                            return userDetailsModel;
                        } else
                            return null;
                    }
                });

    }

}
