package com.forc.foracadem.backend.utils;

import com.forc.foracadem.backend.dao.roleDAO.RoleDaoImp;

import com.forc.foracadem.backend.models.Role;
import com.forc.foracadem.backend.models.Secretaire;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBUtil {
    private static final String HOST = "localhost";
    private static final int PORT = 3308;
    private static final String DB_NAME = "for_academy";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    private static Connection connection;

    public static Connection getConnection() {
        try {
            connection = DriverManager.getConnection(String.format("jdbc:mysql://%s:%d/%s", HOST,PORT,DB_NAME),USERNAME,PASSWORD);
        }catch (SQLException se){
            se.printStackTrace();
        }
        return connection;
    }
}