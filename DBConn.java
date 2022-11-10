import java.sql.*;

public class DBConn {
Connection conn = null;
String dbName  = "capstone";
String dbUrl = "jdbc:mysql://localhost:3306/" + dbName;

String dbUser ="root";
String dbPass = "root";

Statement stmt;
ResultSet rs;

public void dbConn(){
    try{
        conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
        stmt = conn.createStatement();

    }catch(SQLException e){
        e.printStackTrace();
    }
}
}