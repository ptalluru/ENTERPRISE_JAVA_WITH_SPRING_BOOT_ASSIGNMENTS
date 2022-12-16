package com.ptalluru.jdbcutility;

import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcUtil {
    private static Scanner scanner ;
    private JdbcUtil(){}
    public static Connection getConnection() throws SQLException {
        MysqlConnectionPoolDataSource mysqlConnectionPoolDataSource = new MysqlConnectionPoolDataSource();
        mysqlConnectionPoolDataSource.setDatabaseName("Java");
        mysqlConnectionPoolDataSource.setUser("root");
        mysqlConnectionPoolDataSource.setPassword("Ajay@1995");
        Connection connection = mysqlConnectionPoolDataSource.getConnection();
        return connection;
    }
    public static Scanner getScanner(){
        scanner = new Scanner(System.in);
        return scanner;
    }

    public static void closeScanner(){
        if(scanner!=null){
            scanner.close();
        }
    }
    public static void closeConnections(Connection connection, Statement statement, ResultSet resultSet) throws SQLException {
        if(statement!=null){
            statement.close();
        }
        if(resultSet!=null){
            resultSet.close();
        }
        if(connection!=null){
            connection.close();
        }
    }

}
