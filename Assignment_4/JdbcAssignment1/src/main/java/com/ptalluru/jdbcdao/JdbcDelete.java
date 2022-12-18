package com.ptalluru.jdbcdao;

import com.ptalluru.jdbcutility.JdbcUtil;

import java.sql.*;
import java.util.Scanner;

/**
 * @author PTalluru
 */
public class JdbcDelete {

    /**
     *
     */
    private JdbcDelete(){}

    /**
     *
     */
    public static void deleteStudent(){
        Connection connection = null;
        Statement statement = null;
        Scanner scanner = null;

        try {
            connection = JdbcUtil.getConnection();
            scanner = JdbcUtil.getScanner();

            System.out.print("\nEnter Student id to delete :: ");
            int sId = scanner.nextInt();
            String query = String.format("delete from Student where sid=%d",sId);
            if (connection!=null){
                statement = connection.createStatement();
            }
            if(statement!=null){
                int affectedRows = statement.executeUpdate(query);
                if(affectedRows>0){
                    System.out.println("No. of rows affected :: "+affectedRows);
                }else{
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
