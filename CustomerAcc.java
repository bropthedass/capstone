import java.sql.*;
import java.util.*;

public class CustomerAcc {

    DBConn conn = new DBConn();
    ResultSet rs = conn.rs;
    String query;
    Scanner sc = new Scanner(System.in);

    // '" + param + "'
    // where first_name =''
    public void searchName(String fName, String lName) throws SQLException {
        conn.dbConn();
        query = "SELECT * ,COUNT(*) c FROM customer where first_name = '" + fName + "' AND last_name = '" + lName + "'";
        rs = conn.stmt.executeQuery(query);

        while (rs.next()) {
            String first_name = rs.getString("first_name");
            String last_name = rs.getString("last_name");
            String address = rs.getString("address");
            int acc_num = rs.getInt("acc_num");
            int count = rs.getInt("c");

            if (count < 1) {
                System.out.println("404");
            } else {
                System.out.println(String.format("Account Number:  %d \tName:  %s %s \tAddress:  %s", acc_num, first_name,
                        last_name, address));

            }

        }

    }

    public void addCustomer(String fName, String lName, String address) throws SQLException {
        conn.dbConn();
        query = "INSERT INTO CUSTOMER(FIRST_NAME,LAST_NAME,ADDRESS) VALUES ('" + fName + "', '" + lName + "', '" + address + "')"; 
        conn.stmt.executeUpdate(query);
        
    }
}
