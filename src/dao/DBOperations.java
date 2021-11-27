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
public class DBOperations {
    
    public static void setDataorDelete(String Query,String msg)
    {
        try{
           Connection con = ConnectionProvider.getcon();
           Statement st = con.createStatement();
           int i=st.executeUpdate(Query);
            System.out.println(i+"query updated");
           if(!msg.equals(""))
           JOptionPane.showMessageDialog(null,msg);
           
        }
        catch(Exception e)
        {
          JOptionPane.showMessageDialog(null, e, "Message", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    public static ResultSet getdata(String query)
    {
       try
       {
            Connection con = ConnectionProvider.getcon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            return  rs;
       }
       
       catch(Exception e)
       {
          JOptionPane.showMessageDialog(null, e, "Message", JOptionPane.ERROR_MESSAGE); 
          return null;
       }
    
    }
    
}
