package com.ptalluru.jdbcdao;

import com.ptalluru.jdbcutility.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcsUpdate {

    public static void updateStudent(){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Scanner scanner = null;
        try {
            connection = JdbcUtil.getConnection();

            scanner = JdbcUtil.getScanner();
            System.out.print("Enter Student id to update :: ");
            int sId = scanner.nextInt();
            System.out.print("Enter Student name to update :: ");
            String sName = scanner.next();
            System.out.print("Enter Student age to update :: ");
            int sAge = scanner.nextInt();
            System.out.print("Enter Student addr to update :: ");
            String sAddr = scanner.next();

            String query = "update Student set sname=?,sage=?,saddr=? where sid=?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,sName);
            preparedStatement.setInt(2,sAge);
            preparedStatement.setString(3,sAddr);
            preparedStatement.setInt(4,sId);

            int rowsAffected = preparedStatement.executeUpdate();

            if(rowsAffected>0){
                System.out.println("No. of rows affected :: "+rowsAffected);
            }else{
                System.out.println("No record found for id :: "+sId);
            }

        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                JdbcUtil.closeConnections(connection,preparedStatement,resultSet);
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
