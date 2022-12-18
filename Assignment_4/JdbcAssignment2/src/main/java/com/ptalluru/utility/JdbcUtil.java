package com.ptalluru.utility;

import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author PTalluru
 */
public class JdbcUtil {
    private JdbcUtil(){}

    /**
     *
     * @return Connection
     * @throws SQLException
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
     * @param dateFormat
     * @return java.sql.Date
     * @throws ParseException
     */
    public static Date parseDate(String dateToParse, String dateFormat) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
        java.util.Date date = simpleDateFormat.parse(dateToParse);
        long time = date.getTime();
        Date sqlDate = new Date(time);
        return sqlDate;
    }

    /**
     *
     * @param dateToFormat
     * @param dateFormat
     * @return
     */
    public static String formatDate(Date dateToFormat, String dateFormat) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
        String date = simpleDateFormat.format(dateToFormat);
        return date;
    }

    /**
     *
     * @param connection
     * @param statement
     * @param resultSet
     * @throws SQLException
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