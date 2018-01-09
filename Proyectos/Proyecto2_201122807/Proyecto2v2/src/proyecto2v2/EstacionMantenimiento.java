/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2v2;

/**
 *
 * @author Mynor Escobar
 */
public class EstacionMantenimiento {
    
    public EstacionMantenimiento(){
        
        establecerNumeroEstacion(idSiguiente);
        idSiguiente++;
        establecerDatos("Estacion " + noEstacion);
        disponible = true;
        
    }
    
    public void establecerNumeroEstacion(Integer numero){
        
        this.noEstacion = numero;
        
    }
    
    public int obtenerNumeroEstacion(){
        
        return noEstacion;
        
    }
    
    public void establecerDatos(String datos){
        
        this.datos = datos;
        
    }
    
    public String obtenetDatos(){
        
        return datos;
        
    }
    
    public void establecerDisponibilidad(boolean disponible){
        
        this.disponible = disponible;
        
    }
    
    public boolean obtenerDisponibilidad(){
        
        return disponible;
        
    }
        
    private int noEstacion;
    private String datos;
    private boolean disponible;
    private static int idSiguiente = 1;
    
}
