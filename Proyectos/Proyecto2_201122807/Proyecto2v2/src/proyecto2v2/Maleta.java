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
public class Maleta {
    
    public Maleta(){
        
        establecerNoMaleta(idSiguiente);
        idSiguiente++;
        establecerNombreMaleta("Maleta " + noMaleta);
        
    }
    
    public void establecerNoMaleta(int no){
        
        noMaleta = no;
        
    }
    
    public int obtenerNoMaleta(){
        
        return noMaleta;
        
    }
    
    public void establecerNombreMaleta(String nom){
        
        nombreMaleta = nom;
        
    }
    
    public String obtenetNombreMaleta(){
        
        return nombreMaleta;
        
    }
    
    private int noMaleta;
    private String nombreMaleta;
    private static int idSiguiente = 1;
    
}
