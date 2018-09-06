
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrea
 */
public class Registro {
    private ArrayList<Usuario> user;
    private ArrayList<Reporte> report;
    private ArrayList<Restaurante> restaurant;
    private double rating;
   
    private double fila;
    
    

public Registro(){
    user = new ArrayList<Usuario>();
   report = new ArrayList<Reporte>();
   restaurant = new ArrayList<Restaurante>();
   
 
    
}
public void agregarUsuario(String nombre, String username, String apellido, String contrasena){
		Usuario nuevo = new Usuario();
		String nom = nombre;
		String ape = apellido;
		String usuario = username;
		String contra = contrasena;
		nuevo.setUsuario(nom,usuario,ape,contra);
		user.add(nuevo);
	}
	

 public void agregarReporte(double tipofila){
    Reporte nuevo = new Reporte();
    double fila = tipofila;
    nuevo.setReporte(tipofila);
    report.add(nuevo);
}
 
 public double calcular(){
     double base = 5.0;
     double promedio = 0.0;
     
     for (int i = 0; i<report.size(); i++){
    Reporte r = report.get(i);
    promedio = promedio + r.getReporte();
    
     
 }
  promedio = promedio/report.size();
  return promedio;
 }

    



public List<Usuario> getUsuario(){
    return user;
}
/**
	*Busca un usuario dentro de los usuario registrados y devuelve un numero que ayudara mostrarle al usuario si esta registrado o no
	*@param username usuario del usuario registrado
	*@param contrasena Contrasena del usuario registrado 
	*@return Un 1 si el usuario esta registrado y un 0 si el usuario no esta registrado
	*/	
	public int buscarUsuario(String username, String contrasena){
		Iterator<Usuario> iterator = user.iterator();
		int verificacion = 0;
		while (iterator.hasNext()){
			Usuario prueba = iterator.next();
			String name = prueba.getUsername();
			String contra = prueba.getContrasena();
			if ((name.equals(username)) && (contra.equals(contrasena))){
				verificacion = 1;
				return verificacion;			
			}
		}
		return verificacion;	
	}
        /**
	*Busca a un usuario dentro del registro para guardarlo en una variable para ser devuelta y se usada como la cuenta 
	*@param username nombre del usuario registrado
	*@param contrasena Contrasena del usuario registrado
	*@return El dato tipo usuario al que se le cobrara la orden
	*/	
	public Usuario buscarUsuario2(String username, String contrasena){ 
		Iterator <Usuario> iterator = user.iterator();
		Usuario prueba = new Usuario();
		while (iterator.hasNext()){
			prueba = iterator.next();
			String name = prueba.getUsername();
			String contra = prueba.getContrasena();
			if ((name.equals(username)) && (contra.equals(contrasena))){
				return prueba;
			}else{
				System.out.print("");
			}
		}
		return prueba;
	}

            
        
	

}
