/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrea
 */
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class conexion {
 private Connection conn;
 private Statement st;
 private ResultSet rs;
 
 public Connection getConnection(){
     try{
         String url = "jbdc:mysql://localhost/java";
         String user = "root";
         String pass = "";
         
         Class.forName("com.mysql.jbdc.Driver");
         conn = DriverManager.getConnection(url, user, pass);
     }
     
     catch(SQLException ex){
         System.out.println("Error" + ex.getMessage());
     }
     
     catch(ClassNotFoundException ex){
         System.out.println("Error" + ex.getMessage());
     }
     
     finally{
         return conn;
         
     }
 
         
                 
     }
 public ResultSet searchQuery(String sql){
   try {
       getConnection();
       st = conn.createStatement();
       rs = st.executeQuery(sql);
       
   }  
   catch(SQLException ex){
       System.out.println("Errot"+ex.getMessage());
   }
   return rs;
   }
     
 }
 
 
  
  