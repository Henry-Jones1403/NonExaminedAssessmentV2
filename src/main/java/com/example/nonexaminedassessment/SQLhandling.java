package com.example.nonexaminedassessment;
import java.sql.*;


public class SQLhandling {
    public static void SQLTest() {
        String DatabaseLocation = System.getProperty("user.dir") + "\\ProjectDatabase.accdb";
        try {
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://" + DatabaseLocation, "", "");
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String sql = "SELECT * FROM Accounts";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.println("Employeename : " + rs.getString("Password"));
            }

        } catch (Exception e) {
            System.out.println("Error in the SQL class: " + e);
        }
    }
}