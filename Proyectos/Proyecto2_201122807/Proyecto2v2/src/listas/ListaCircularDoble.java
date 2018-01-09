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
public class ListaCircularDoble {
    
    public ListaCircularDoble(){
        
        primero = null;
        ultimo = null;
        
    }
    
    public void establecerElPrimero(NodoDoble primero){
        
        this.primero = primero;
        
    }
    
    public void establecerAlInicio(Object dato) throws ExceptionALista{
        
        NodoDoble nodoNuevo = new NodoDoble(dato);
        if(primero == null){
            
            primero = nodoNuevo;
            primero.establecerSiguiente(primero);
            ultimo = primero;
            nodoNuevo.establecerAnterior(ultimo);
            
        } else {
            
            nodoNuevo.establecerSiguiente(primero);
            primero.establecerSiguiente(nodoNuevo);
            nodoNuevo.establecerSiguiente(ultimo);
            ultimo.establecerSiguiente(nodoNuevo);
            primero = nodoNuevo;
            
        }
        
    }
    
    public NodoDoble obtenerAlInicio(){
        
        return primero;
        
    }
    
    public void removerAlInicio() throws ExceptionALista{
        
        if(primero == ultimo){
            
            primero = ultimo = null;
            
        } else {
            
            primero = primero.obtenerSiguiente();
            ultimo.establecerSiguiente(primero);
            primero.establecerAnterior(ultimo);
            
        }
        
    }
    
    public void establecerElUltimo(NodoDoble ultimo){
        
        this.ultimo = ultimo;
        
    }
    
    public void establecerAlFinal(Object dato) throws ExceptionALista{
        
        NodoDoble nodoNuevo = new NodoDoble(dato);
        if(primero == null){
            
            primero = nodoNuevo;
            primero.establecerSiguiente(primero);
            ultimo = primero;
            nodoNuevo.establecerAnterior(ultimo);
            
        } else {
            
            ultimo.establecerSiguiente(nodoNuevo);
            nodoNuevo.establecerSiguiente(primero);
            nodoNuevo.establecerAnterior(ultimo);
            ultimo = nodoNuevo;
            primero.establecerAnterior(ultimo);
            
        }
        
    }
    
    public NodoDoble obtenerAlFinal(){
        
        return ultimo;
        
    }
    
    public void removerAlFinal() throws ExceptionALista{
        
        if(primero == ultimo){
            
            primero = ultimo = null;
            
        } else {
            
            ultimo = ultimo.obtenerAnterior();
            primero.establecerAnterior(ultimo);
            ultimo.establecerSiguiente(primero);
            
        }
        
    }
    
    public void mostrarLista()throws ExceptionALista{
        
        NodoDoble mostrar = primero;
        do{
            
            System.out.println("Info: " + mostrar.obtenerDato());
            mostrar = mostrar.obtenerSiguiente();
            
        }while(mostrar != primero);
        
    }
    
    private NodoDoble primero;
    private NodoDoble ultimo;
    
}
