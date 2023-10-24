package com.aptechBank.controller;

import com.aptechBank.DB.DbConnector;

import java.sql.Connection;
import java.sql.SQLException;

public class PersonController {
    public void insert(Customer customer) throws SQLException{
        DbConnector dbConnector = new DbConnector();
        Connection connection = dbConnector.getConnection();
    }
    public void delete(int id) throws SQLException{}
    public void update(Customer customer) throws SQLException{}
}
