/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class ConnectionProvider {
    
    public static Connection getcon()
    {
        Connection con=null;
        try
        {
           Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cms","root","");
           return con;
          
            
        }
        catch(Exception e){ 
            JOptionPane.showMessageDialog(null, e);
              
                
                }
     return con;
}
}
    

  
