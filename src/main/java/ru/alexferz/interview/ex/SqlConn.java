package ru.alexferz.interview.ex;

import java.sql.*;

public class SqlConn {
    public void method() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://someDnsName:34567/db");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("Select * FROM some_table");
            rs.first();
            while(rs.next()) {
                //do smth
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            //handle axception
        }
    }
}
