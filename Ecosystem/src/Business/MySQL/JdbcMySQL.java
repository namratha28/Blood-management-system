/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.MySQL;

//import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.*;


/**
 *
 * @author Huangdong Wen <wen.hu@husky.neu.edu>
 */
public class JdbcMySQL {

    public static void main(String args[]) {
        ResultSet rs;
        Statement stmt;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/eco", "root", "123456");
//here sonoo is database name, root is username and password  
            stmt =  con.createStatement();
            rs = stmt.executeQuery("select * from feedback.comments");
            //writeResultSet(resultSet);
//            while (rs.next()) {
//                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
//            }
            rs.close();
            stmt.close();

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
