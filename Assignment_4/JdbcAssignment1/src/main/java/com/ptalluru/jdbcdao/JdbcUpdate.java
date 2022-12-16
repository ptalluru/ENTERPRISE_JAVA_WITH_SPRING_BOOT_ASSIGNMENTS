package com.ptalluru.jdbcdao;

import com.ptalluru.jdbcutility.JdbcUtil;

import java.sql.*;
import java.util.Scanner;

/**
 * @author PTalluru
 */
public class JdbcUpdate {

    /**
     *
     */
    public static void updateStudent(){
        Connection connection = null;
        Statement statement = null;
        Scanner scanner = null;
        try {
            connection = JdbcUtil.getConnection();
            scanner = JdbcUtil.getScanner();
            System.out.print("Enter Student id to update :: ");
            int sId = scanner.nextInt();
            ResultSet resultSet = JdbcRead.getStudentById(sId);
            if(resultSet.next()){
                System.out.print("Enter Student name to update :: ");
                String sName = scanner.next();
                System.out.print("Enter Student age to update :: ");
                int sAge = scanner.nextInt();
                System.out.print("Enter Student addr to update :: ");
                String sAddr = scanner.next();

                String query = String.format("update Student set sname='%s',sage=%d,saddr='%s' where sid=%d",sName,sAge,sAddr,sId);
                if (connection!=null){
                    statement = connection.createStatement();
                }
                if(statement!=null){
                    int rowsAffected = statement.executeUpdate(query);
                    System.out.println("No. of rows affected :: "+rowsAffected);
                } else{
                    System.out.println("No record found for id :: "+sId);
                }
            }

        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                JdbcUtil.closeConnections(connection,statement,null);
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
