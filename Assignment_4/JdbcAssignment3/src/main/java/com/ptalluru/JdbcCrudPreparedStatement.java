/*
Question3
perform CRUD operation using preparedStatement
      1. insert 2. update 3. select 4. delete
 */
package com.ptalluru;

import com.ptalluru.dao.JdbcCreate;
import com.ptalluru.dao.JdbcDelete;
import com.ptalluru.dao.JdbcRead;
import com.ptalluru.dao.JdbcUpdate;
import com.ptalluru.utility.JdbcUtil;

import java.util.Scanner;

/**
 * @PTalluru
 */
public class JdbcCrudPreparedStatement {
    /**
     *
     * @param args
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean login = true;
        System.out.println("***** Welcome To JDBC Crud Operations With Prepared Statement *****");
        while (login){
            System.out.println("------------------------------------");
            System.out.println("-----Available CRUD Operations-----");
            System.out.println("1.Create \n2.Read \n3.Update \n4.Delete \nSelect the above options to perform CRUD operations \npress ANY key(except 1,2,3,4) to exit");
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
                    JdbcUpdate.updateStudent();
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
    }
}