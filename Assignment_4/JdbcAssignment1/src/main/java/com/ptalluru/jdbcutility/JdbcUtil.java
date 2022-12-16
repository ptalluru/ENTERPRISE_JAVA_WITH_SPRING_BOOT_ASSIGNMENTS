package com.ptalluru.jdbcutility;

import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;

import java.sql.*;
import java.util.Scanner;

/**
 * @author PTalluru
 * @Class JdbcUtil provides utilities like get & close Jdbc connections and Scanner connections
 */
public class JdbcUtil {
    private static Scanner scanner ;
    private JdbcUtil(){}

    /**
     *
     * @return Connection
     * @throws SQLException
     *
     */
    public static Connection getConnection() throws SQLException {
        MysqlConnectionPoolDataSource mysqlConnectionPoolDataSource = new MysqlConnectionPoolDataSource();
        mysqlConnectionPoolDataSource.setDatabaseName("Java");
        mysqlConnectionPoolDataSource.setUser("root");
        mysqlConnectionPoolDataSource.setPassword("Ajay@1995");
        Connection connection = mysqlConnectionPoolDataSource.getConnection();
        return connection;
    }

    /**
     *
     * @return Scanner
     */
    public static Scanner getScanner(){
        scanner = new Scanner(System.in);
        return scanner;
    }

    /**
     * This method closes the scanner
     */
    public static void closeScanner(){
        if(scanner!=null){
            scanner.close();
        }
    }

    /**
     *
     * @param connection
     * @param statement
     * @param resultSet
     * @throws SQLException
     * This method closes the Jdbc connections
     */
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
