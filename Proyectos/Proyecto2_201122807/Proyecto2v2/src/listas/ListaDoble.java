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
public class ListaDoble {
    
    public ListaDoble(){
        
        primero = null;
        ultimo = null;
        
    }
    
    public void establecerAlInicio(Object dato) throws ExceptionALista{
        
        NodoDoble nodoNuevo = new NodoDoble(dato);
        if(primero == null){
            
            primero = nodoNuevo;
            primero.establecerSiguiente(null);
            primero.establecerAnterior(null);
            ultimo = primero;
            
        } else {
            
            nodoNuevo.establecerSiguiente(primero);
            primero.establecerAnterior(nodoNuevo);
            primero = nodoNuevo;
            
        }
        
    }
    
    public NodoDoble obtenerAlInicio(){
        
        return primero;
        
    }
    
    public Object removerAlInicio() throws ExceptionALista{
        
        Object remover = "Vacio";
        if(primero != null){
            
            remover = primero.obtenerDato();
            if(primero == ultimo){
                
                primero = ultimo = null;
                
            } else {
                
                primero = primero.obtenerSiguiente();
                primero.establecerAnterior(null);
                
            }
            
        }
        
        return remover;
        
    }
    
    public void establecerAlFinal(Object dato) throws ExceptionALista{
        
        NodoDoble nodoNuevo = new NodoDoble(dato);
        if(primero == null){
            
            primero = nodoNuevo;
            primero.establecerSiguiente(null);
            primero.establecerAnterior(null);
            ultimo = primero;
            
        } else {
            
            ultimo.establecerSiguiente(nodoNuevo);
            nodoNuevo.establecerAnterior(ultimo);
            ultimo = nodoNuevo;
            
        }
        
    }
    
    public NodoDoble obtenerAlFinal(){
        
        return ultimo;
        
    }
    
    public Object removerAlFinal() throws ExceptionALista{
        
        NodoDoble remov = primero;
        Object remover = "Vacio";
        if(ultimo != null){
            
            remover = ultimo.obtenerDato();
            if(primero == ultimo){
                
                primero = ultimo = null;
                
            } else {
                
                do{
                    
                    if(remov.obtenerSiguiente() == ultimo){
                        
                        remov.establecerSiguiente(null);
                        ultimo = remov;
                        //break;
                        
                    }
                    
                    remov = remov.obtenerSiguiente();
                    
                }while(remov != null);
                
            }
            
        }
        
        return remover;
        
    }
    
    public int tamano()throws ExceptionALista{
        
        NodoDoble nodoNuevo = primero;
        int tamano = 0;
        if(primero != null){
            
            while(nodoNuevo != null){
                
                tamano++;
                nodoNuevo = nodoNuevo.obtenerSiguiente();
                
            }
            
        }
        
        return tamano;
        
    }
    
    public void buscar(Object dato) throws ExceptionALista{
        
        NodoDoble nodoNuevo = primero;
        while(nodoNuevo != null){
            
            if(nodoNuevo.obtenerDato() == dato){
                
                System.out.println("Este nodo si fue encontrado");
                
            }
            
            nodoNuevo = nodoNuevo.obtenerSiguiente();
            
        }
        
    }
    
    public void mostrarLista() throws ExceptionALista{
        
        NodoDoble nodoNuevo = primero;
        if(primero == null){
            
            System.out.println("Vacio");
            
        } else {
            
            while(nodoNuevo != null){
                
                System.out.println("Info: " + nodoNuevo.obtenerDato());
                nodoNuevo = nodoNuevo.obtenerSiguiente();
                
            }
            
        }
        
    }
    
    public void editar(Object dato, Object datoNuevo) throws ExceptionALista{
        
        NodoDoble editar = primero;
        while(editar != null){
            
            if(editar.obtenerDato() == dato){
                
                editar.establecerDato(datoNuevo);
                System.out.println("Nodo ha sido editado!");
                
            }
            
            editar = editar.obtenerSiguiente();
            
        }
        
    }
    
    private NodoDoble primero;
    private NodoDoble ultimo;
    
}
