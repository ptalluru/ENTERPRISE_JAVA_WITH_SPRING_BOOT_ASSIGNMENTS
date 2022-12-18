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
public class JdbcDelete {

    private JdbcDelete(){}

    /**
     *
     */
    public static void deleteStudent(){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Scanner scanner = null;

        try {
            connection = JdbcUtil.getConnection();
            scanner = JdbcUtil.getScanner();

            System.out.print("\nEnter Student id to delete :: ");
            int sId = scanner.nextInt();
            scanner.nextLine();
            String query = "delete from Student where sid=?";

            if (connection!=null) {
                preparedStatement = connection.prepareStatement(query);
            }
            if (preparedStatement!=null) {
                preparedStatement.setInt(1, sId);
                int affectedRows = preparedStatement.executeUpdate();
                if (affectedRows > 0) {
                    System.out.println("No. of rows affected :: " + affectedRows);
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
