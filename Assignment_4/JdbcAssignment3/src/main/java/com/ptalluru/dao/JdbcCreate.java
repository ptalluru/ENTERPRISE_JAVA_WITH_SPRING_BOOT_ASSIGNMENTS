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
public class JdbcCreate {

    private JdbcCreate(){}

    /**
     *
     */
    public static void saveStudent(){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Scanner scanner = null;
        try {
            connection = JdbcUtil.getConnection();

            scanner = JdbcUtil.getScanner();
            System.out.print("Enter Student name :: ");
            String sName = scanner.nextLine();
            System.out.print("Enter Student age :: ");
            int sAge = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Student addr :: ");
            String sAddr = scanner.nextLine();

            String query = "insert into Student(`sname`,`sage`,`saddr`) values(?,?,?)";
            if(connection!=null){
                preparedStatement = connection.prepareStatement(query);
            }
            if (preparedStatement!=null){
                preparedStatement.setString(1,sName);
                preparedStatement.setInt(2,sAge);
                preparedStatement.setString(3,sAddr);

                int rowsAffected = preparedStatement.executeUpdate();
                System.out.println("No. of rows affected :: "+rowsAffected);
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
