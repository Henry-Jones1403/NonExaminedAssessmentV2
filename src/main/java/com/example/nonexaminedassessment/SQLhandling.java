package com.example.nonexaminedassessment;
import java.sql.*;


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
    }
}