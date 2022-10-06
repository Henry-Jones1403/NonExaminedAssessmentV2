package com.example.nonexaminedassessment;
import java.sql.*;
import java.util.ArrayList;


public class SQLhandling {
    public static boolean LoginSQL(String Username, String Password) {
        String DatabaseLocation = System.getProperty("user.dir") + "\\ProjectDatabase.accdb";
        try {
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://" + DatabaseLocation, "", "");

            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String sql = "SELECT * FROM Accounts";
            ResultSet RS = stmt.executeQuery(sql);
            while (RS.next()) {
                if(Username.equals(RS.getString("Username"))){
                    if(RS.getString("Password").equals(Password)){
                        con.close();
                        return true;
                    }
                }
            }con.close();
        } catch (Exception e) {
            System.out.println("Error in the SQL class: " + e);
        }return false;


    }public static ArrayList print(String sql, String Column, String search_sol) {
        ArrayList <String> output = new ArrayList<>();
        String DatabaseLocation = System.getProperty("user.dir") + "\\ProjectDatabase.accdb";
        try {
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://" + DatabaseLocation, "", "");
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            //System.out.println(sql);
            ResultSet Rs = stmt.executeQuery(sql);
            ResultSetMetaData rsmd = Rs.getMetaData();
            int columnsNumber = rsmd.getColumnCount();
            Rs.last();
            int rows = Rs.getRow();
            Rs.beforeFirst();
            if(rows>1){
                while (Rs.next()){
                    System.out.println(Rs.getString("FirstName") + Rs.getString("LastName"));
                }
            }
           while (Rs.next()) {
               for (int i = 1; i < columnsNumber; i++) {
                   String columnValue = Rs.getString(i);
                   output.add(columnValue);
               }

               //if (Rs.getString(Column).equals(search_sol))
               //output.add(Rs.getString(Column));
           }con.close();

               // return (Rs.getString(Column));

           // }
        } catch (Exception e) {
            System.out.println(e);
        }
        return output;
    }
}