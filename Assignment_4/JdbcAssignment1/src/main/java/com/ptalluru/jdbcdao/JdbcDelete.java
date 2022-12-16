package com.ptalluru.jdbcdao;

import com.ptalluru.jdbcutility.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcDelete {
    public static void deleteStudent(){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Scanner scanner = null;

        try {
            connection = JdbcUtil.getConnection();
            scanner = JdbcUtil.getScanner();

            System.out.print("\nEnter Student id to delete :: ");
            int sId = scanner.nextInt();
            String query = "delete from Student where sid=?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,sId);
            int affectedRows = preparedStatement.executeUpdate();
            if(affectedRows>0){
                System.out.println("No. of rows affected :: "+affectedRows);
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
