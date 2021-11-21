package database;

import java.sql.*;
import java.util.*;

public class Database {
    public static void main(String args[]) throws Exception {
        Class.forName("org.sqlite.JDBC");
        Connection con=DriverManager.getConnection("JDBC sqlite:c://sqlite//univ");
        Statement stm=con.createStatement();
        stm.executeUpdate("create table Temp (a integer, b float)");

        stm.close();
        con.close();
    }

}
