/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banksystem;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author OMAR
 */
public class DatabaseConnection {
    private static DatabaseConnection instance;
    private Connection con;


    private DatabaseConnection() {
       try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdb", "root", "");
            JOptionPane.showMessageDialog(null,"Connection success");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Connection failed");
        }
    }

    public static synchronized DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public Connection getConnection() {
        return con;
    }
}
