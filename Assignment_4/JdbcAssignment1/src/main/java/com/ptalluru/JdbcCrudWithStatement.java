/*
Question1
Give the menu to the user as the operation listed below on student table
1. Create   2. Read    3. Update   4. Delete
 */
package com.ptalluru;

import com.ptalluru.jdbcdao.JdbcCreate;
import com.ptalluru.jdbcdao.JdbcDelete;
import com.ptalluru.jdbcdao.JdbcRead;
import com.ptalluru.jdbcdao.JdbcsUpdate;
import com.ptalluru.jdbcutility.JdbcUtil;

import java.util.Scanner;

/**
 * @PTalluru
 */
public class JdbcAssignmentOne {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean login = true;
        System.out.println("***** Welcome To JDBC Crud Operations *****");
        while (login){
            System.out.println("------------------------------------");
            System.out.println("-----Available CRUD Operations-----");
            System.out.println("1.Create Student Record (Enter 1)\n2.Get All Students Record (Enter 2)\n3.Update the Student Record (Enter 3)\n4.Delete the Student Record (Enter 4)\nSelect the above options to perform CRUD operations \npress ANY key(except 1,2,3,4) to exit");
            System.out.println("------------------------------------");
            String crudOp = scanner.nextLine();
            switch (crudOp){
                case "1":
                    JdbcCreate.saveStudent();
                    break;
                case "2":
                    JdbcRead.printStudents();
                    break;
                case "3":
                    JdbcsUpdate.updateStudent();
                    break;
                case "4":
                    JdbcDelete.deleteStudent();
                    break;
                default:
                    JdbcUtil.closeScanner();
                    System.exit(0);
                    break;
            }
        }
        JdbcRead.printStudents();
    }
}