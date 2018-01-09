/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author Mynor Escobar
 */
public class Nodo {
    
    public Nodo(Object dato){//Construcctor con un parametro
        
        establecerDato(dato);
        establecerSiguiente(null);
        
    }
    
    public Nodo(Object dato, Nodo siguiente){
        
        establecerDato(dato);
        establecerSiguiente(siguiente);
        
    }
    
    public void establecerDato(Object dato){
        
        this.dato = dato;
        
    }
    
    public Object obtenerDato(){
        
        return dato;
        
    }
    
    public void establecerSiguiente(Nodo siguiente){
        
        this.siguiente = siguiente;
        
    }
    
    public Nodo obtenerSiguiente(){
        
        return siguiente;
        
    }
    
    private Nodo siguiente;
    private Object dato;
    
}
