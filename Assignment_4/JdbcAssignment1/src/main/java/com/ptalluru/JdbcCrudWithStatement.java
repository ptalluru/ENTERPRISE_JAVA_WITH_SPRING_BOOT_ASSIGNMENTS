/*
Question1
Give the menu to the user as the operation listed below on student table
1. Create   2. Read    3. Update   4. Delete

*/
package com.ptalluru;

import com.ptalluru.jdbcdao.JdbcCreate;
import com.ptalluru.jdbcdao.JdbcDelete;
import com.ptalluru.jdbcdao.JdbcRead;
import com.ptalluru.jdbcdao.JdbcUpdate;
import com.ptalluru.jdbcutility.JdbcUtil;

import java.util.Scanner;

/**
 * @author PTalluru
 *
 * @Class JdbcCrudWithStatement to perform CRUD operations using Statement in jdbc
 */
public class JdbcCrudWithStatement {
    /**
     *
     * Main method to run the application
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean login = true;
        System.out.println("***** Welcome To JDBC Crud Operations with Statement *****");
        while (login){
            System.out.println("-----------------------------------");
            System.out.println("-----Available CRUD Operations-----");
            System.out.println("1.Create \n2.Read \n3.Update \n4.Delete \nSelect the above options to perform CRUD operations \npress ANY key(except 1,2,3,4) to exit");
            System.out.println("-----------------------------------");
            String crudOp = scanner.nextLine();
            switch (crudOp){
                case "1":
                    /**
                     * Create the Student record
                     */
                    JdbcCreate.saveStudent();
                    break;
                case "2":
                    /**
                     * Prints all Student records
                     */
                    JdbcRead.printAllStudents();
                    break;
                case "3":
                    /**
                     * Update the Student record
                     */
                    JdbcUpdate.updateStudent();
                    break;
                case "4":
                    /**
                     * Delete the Student record
                     */
                    JdbcDelete.deleteStudent();
                    break;
                default:
                    /**
                     * Closes the scanner and exit the application
                     */
                    JdbcUtil.closeScanner();
                    System.exit(0);
                    break;
            }
        }
    }
}