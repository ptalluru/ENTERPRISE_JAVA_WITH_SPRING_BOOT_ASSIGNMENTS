package com.ptalluru.jdbcdao;

import com.ptalluru.jdbcutility.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcRead {

    public static void printStudents(){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = JdbcUtil.getConnection();
            String query = "select * from Student";
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            System.out.println("SID\tSNAME\tSAGE\tSADDR");
            System.out.println("==========================");
            while (resultSet.next()){
                System.out.println(resultSet.getInt(1)+"\t"+resultSet.getString(2)+"\t"+resultSet.getInt(3)+"\t"+resultSet.getString(4));
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
