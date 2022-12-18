package com.ptalluru.jdbcoperations;

import com.ptalluru.utility.JdbcUtil;

import java.sql.*;

public class JdbcRead {
    public static void getRecords(){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = JdbcUtil.getConnection();
            String query = "select `username`,`address`,`gender`,`dob`,`doj`,`dom` from userdata";
            if (connection!=null){
                preparedStatement = connection.prepareStatement(query);
            }
            if (preparedStatement!=null){
                resultSet = preparedStatement.executeQuery();
            }
            if (resultSet!=null){
                System.out.println("==============================================================");
                System.out.println("USERNAME\tADRESS\tGENDER\tDOB\t\t\tDOJ\t\t\tDOM");
                System.out.println("==============================================================");
                while (resultSet.next()){
                    String username = resultSet.getString(1);
                    String address = resultSet.getString(2);
                    String gender = resultSet.getString(3);
                    Date birth = resultSet.getDate(4);
                    String dob = JdbcUtil.formatDate(birth,"dd-MM-yyyy");
                    Date joining = resultSet.getDate(5);
                    String doj = JdbcUtil.formatDate(joining,"MM-dd-yyyy");
                    Date marriage = resultSet.getDate(6);
                    String dom = JdbcUtil.formatDate(marriage,"yyyy-MM-dd");
                    System.out.println(username+"\t"+address+"\t"+gender+"\t"+dob+"\t"+doj+"\t"+dom);
                }
            }
        } catch (SQLException se) {
            se.printStackTrace();
        } finally {
            try {
                JdbcUtil.closeConnections(connection,preparedStatement,resultSet);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
