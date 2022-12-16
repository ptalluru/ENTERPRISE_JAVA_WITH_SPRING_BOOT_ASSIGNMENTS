package com.ptalluru.jdbcdao;

import com.ptalluru.jdbcutility.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcCreate {
    public static void saveStudent(){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Scanner scanner = null;
        try {
            connection = JdbcUtil.getConnection();

            scanner = JdbcUtil.getScanner();
            System.out.print("Enter Student name :: ");
            String sName = scanner.next();
            System.out.print("Enter Student age :: ");
            int sAge = scanner.nextInt();
            System.out.print("Enter Student addr :: ");
            String sAddr = scanner.next();

            String query = "insert into Student(`sname`,`sage`,`saddr`) values(?,?,?)";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,sName);
            preparedStatement.setInt(2,sAge);
            preparedStatement.setString(3,sAddr);

            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println("No. of rows affected :: "+rowsAffected);

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
