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
public class NodoDoble {
    
    public NodoDoble(Object dato){
        
        this(null, null, dato);
        
    }
    
    public NodoDoble(NodoDoble anterior, NodoDoble siguiente, Object dato){
        
        establecerAnterior(anterior);
        establecerSiguiente(siguiente);
        establecerDato(dato);
        
    }
    
    public void establecerAnterior(NodoDoble anterior){
        
        this.anterior = anterior;
        
    }
    
    public NodoDoble obtenerAnterior(){
        
        return anterior;
        
    }
    
    public void establecerSiguiente(NodoDoble siguiente){
        
        this.siguiente = siguiente;
        
    }
    
    public NodoDoble obtenerSiguiente(){
        
        return siguiente;
        
    }
    
    public void establecerDato(Object dato){
        
        this.dato = dato;
        
    }
    
    public Object obtenerDato(){
        
        return dato;
        
    }
    
    private NodoDoble anterior;
    private NodoDoble siguiente;
    private Object dato;
    
}
