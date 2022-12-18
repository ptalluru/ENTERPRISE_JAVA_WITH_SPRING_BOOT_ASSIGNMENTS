package com.ptalluru.jdbcdao;

import com.ptalluru.jdbcutility.JdbcUtil;

import java.sql.*;
import java.util.Scanner;

/**
 * @author PTalluru
 */
public class JdbcCreate {

    /**
     *
     */
    private JdbcCreate(){}
    /**
     *
     */
    public static void saveStudent(){
        Connection connection = null;
        Statement statement = null;
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
            String query = String.format("insert into Student(`sname`,`sage`,`saddr`) values('%s',%d,'%s')",sName,sAge,sAddr);

            if(connection!=null){
                statement = connection.createStatement();
            }
            if (statement != null) {
                int rowsAffected = statement.executeUpdate(query);
                System.out.println("No. of rows affected :: "+rowsAffected);
            }
        } catch (SQLException se ) {
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
