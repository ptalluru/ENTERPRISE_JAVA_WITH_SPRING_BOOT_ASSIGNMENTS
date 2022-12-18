/*
Question2
perform insertion opertion and also perform retrieval operation on the following
data
name =>
address=>
gender  =>
DOB DOJ DOM
=> dd-MM-yyyy
=> MM-dd-yyyy
=> yyyy-MM-dd
*/
package com.ptalluru;
import com.ptalluru.jdbcoperations.JdbcInsert;
import com.ptalluru.jdbcoperations.JdbcRead;

import java.util.Scanner;

/**
 * @author PTalluru
 */
public class JdbcDateAssignment {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean login = true;
        System.out.println("***** Welcome To JDBC Date Operations *****");
        while (login){
            System.out.println("------------------------------------");
            System.out.println("-----Available Operations-----");
            System.out.println("1.Create User Record (Enter 1)\n2.Get All Users Record (Enter 2)\nSelect the above options to perform operations \npress ANY key(except 1,2) to exit");
            System.out.println("------------------------------------");
            String crudOp = scanner.nextLine();
            switch (crudOp){
                case "1":
                    JdbcInsert.insertRecord();
                    break;
                case "2":
                    JdbcRead.getRecords();
                    break;
                default:
                    scanner.close();
                    System.exit(0);
                    break;
            }
        }
    }
}