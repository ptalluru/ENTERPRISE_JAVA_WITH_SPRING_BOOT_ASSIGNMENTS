package com.ptalluru.jdbcdao;

import com.ptalluru.jdbcutility.JdbcUtil;

import java.sql.*;

/**
 * @author PTalluru
 */
public class JdbcRead {
    private static Connection connection = null;
    private static Statement statement = null;
    private static ResultSet resultSet = null;

    /**
     *
     * @param sId
     * @return
     */
    public static ResultSet getStudentById(int sId){

        try {
            connection = JdbcUtil.getConnection();
            String query = String.format("select * from Student where sid=%d",sId);
            if(connection!=null){
                statement = connection.createStatement();
            }
            if (statement!=null){
                resultSet = statement.executeQuery(query);
            }
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultSet;
    }

    /**
     *
     */
    public static void printAllStudents(){

        try {
            connection = JdbcUtil.getConnection();
            String query = "select * from Student";

            if(connection!=null){
                statement = connection.createStatement();
            }
            if (statement!=null){
                resultSet = statement.executeQuery(query);
            }
            if (resultSet!=null){
                System.out.println("SID\tSNAME\tSAGE\tSADDR");
                System.out.println("==========================");
                while (resultSet.next()){
                    System.out.println(resultSet.getInt(1)+"\t"+resultSet.getString(2)+"\t"+resultSet.getInt(3)+"\t"+resultSet.getString(4));
                }
            }
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                JdbcUtil.closeConnections(connection,statement,resultSet);
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
