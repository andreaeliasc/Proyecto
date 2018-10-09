/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Se renovo codigo debido a fallos en el anterior
 * @author Andrea
 */
import java.sql.*;


public class conexion {
  private Statement st;
 private ResultSet rs;
     Connection conectar = null;
     
     public Connection getconectar(){
         try{
             Class.forName("com.mysql.jdbc.Driver");
             conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
         }catch (ClassNotFoundException | SQLException e){
             System.out.println("Error al conectar: "+e.getMessage());
         }
         return conectar;
         
     }
public ResultSet searchQuery(String sql){
   try {
       getconectar();
       st = conectar.createStatement();
       rs = st.executeQuery(sql);
       
   }  
   catch(SQLException ex){
       System.out.println("Errot"+ex.getMessage());
   }
   return rs;
   }

     



}
 
  
  
