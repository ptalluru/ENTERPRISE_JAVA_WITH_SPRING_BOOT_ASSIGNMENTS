package com.ptalluru.dao;

import com.ptalluru.utility.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * @author PTalluru
 */
public class JdbcUpdate {

    private JdbcUpdate(){}

    /**
     *
     */
    public static void updateStudent(){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Scanner scanner = null;
        try {
            connection = JdbcUtil.getConnection();

            scanner = JdbcUtil.getScanner();
            System.out.print("Enter Student id to update :: ");
            int sId = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Student name to update :: ");
            String sName = scanner.nextLine();
            System.out.print("Enter Student age to update :: ");
            int sAge = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Student addr to update :: ");
            String sAddr = scanner.nextLine();

            String query = "update Student set sname=?,sage=?,saddr=? where sid=?";
            if (connection!=null) {
                preparedStatement = connection.prepareStatement(query);
            }
            if (preparedStatement!=null) {
                preparedStatement.setString(1, sName);
                preparedStatement.setInt(2, sAge);
                preparedStatement.setString(3, sAddr);
                preparedStatement.setInt(4, sId);

                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("No. of rows affected :: " + rowsAffected);
                } else {
                    System.out.println("No record found for id :: " + sId);
                }
            }
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                JdbcUtil.closeConnections(connection,preparedStatement,null);
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
