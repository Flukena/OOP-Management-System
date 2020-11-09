/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stock;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DataCustomer  extends customer{
     public DataCustomer() {
        Connect();
    }
    Connection con;
    PreparedStatement pst;
    DefaultTableModel def;
        public void Connect() {
        //เชื่อม Database
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/stockmansys", "root", "");//เชื่อม Database ชื่อ stockmansys
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "ไม่สามารถเชื่อมต่อฐานข้อมูลได้กรุณาลองใหม่อีกครั้ง");
        }
    }

  
}
