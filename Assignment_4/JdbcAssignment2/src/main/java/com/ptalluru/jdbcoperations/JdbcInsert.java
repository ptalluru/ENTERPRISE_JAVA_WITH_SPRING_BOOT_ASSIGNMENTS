package com.ptalluru.jdbcoperations;

import com.ptalluru.utility.JdbcUtil;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Scanner;

/**
 * @author PTalluru
 */
public class JdbcInsert {

    /**
     *
     */
    private JdbcInsert(){}

    /**
     *
     *
     */
    public static void insertRecord(){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Scanner scanner = null;
        try {
            connection = JdbcUtil.getConnection();
            scanner = new Scanner(System.in);

            System.out.print("Enter username :: ");
            String userName = scanner.nextLine();

            System.out.print("Enter address  :: ");
            String address = scanner.nextLine();

            System.out.print("Enter gender :: ");
            String gender = scanner.nextLine();

            System.out.print("Enter date of birth (dd-MM-yyyy) :: ");
            String birth = scanner.nextLine();
            Date dob = JdbcUtil.parseDate(birth,"dd-MM-yyyy");

            System.out.print("Enter date of joining (MM-dd-yyyy) :: ");
            String joining = scanner.nextLine();
            Date doj = JdbcUtil.parseDate(joining,"MM-dd-yyyy");

            System.out.print("Enter date of marriage (yyyy-MM-dd) :: ");
            String marriage = scanner.nextLine();
            Date dom = Date.valueOf(marriage);

            String query = "insert into userdata(`username`,`address`,`gender`,`dob`,`doj`,`dom`) values(?,?,?,?,?,?)";
            if (connection!=null){
                preparedStatement = connection.prepareStatement(query);
            }
            if (preparedStatement!=null){
                preparedStatement.setString(1,userName);
                preparedStatement.setString(2,address);
                preparedStatement.setString(3,gender);
                preparedStatement.setDate(4,dob);
                preparedStatement.setDate(5,doj);
                preparedStatement.setDate(6,dom);

                int affectedRows = preparedStatement.executeUpdate();
                System.out.println("No. of rows affected :: "+affectedRows);
            }
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (ParseException pe) {
            pe.printStackTrace();
        } finally {
            try {
                JdbcUtil.closeConnections(connection,preparedStatement,null);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
