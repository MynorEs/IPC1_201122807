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
public class ListaSimple {
    
    public ListaSimple(){
        
        primero = null;
        ultimo = null;
        
    }
    
    public void establecerElPrimero(Nodo primero){
        
        this.primero = primero;
        
    }
    
    public void establecerAlInicio(Object dato) throws ExceptionALista{
        
        Nodo nodoNuevo = new Nodo(dato);
        if(primero == null){
            
            primero = nodoNuevo;
            primero.establecerSiguiente(null);
            ultimo = primero;
            
        } else {
            
            nodoNuevo.establecerSiguiente(primero);
            primero = nodoNuevo;
            
        }
        
    }
    
    public Nodo obtenerAlInicio(){
        
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
                
            }
            
        }
        
        return remover;
        
    }
    
    public void establecerAlFinal(Object dato) throws ExceptionALista{
        
        Nodo nodoNuevo = new Nodo(dato);
        if(primero == null){
            
            primero = nodoNuevo;
            primero.establecerSiguiente(null);
            ultimo = primero;
            
        } else {
            
            ultimo.establecerSiguiente(nodoNuevo);
            nodoNuevo.establecerSiguiente(null);
            ultimo = nodoNuevo;
            
        }
        
    }
    
    public Nodo obtenerAlFinal(){
        
        return ultimo;
        
    }
    
    public Object removerAlFinal(){
        
        Nodo actual = primero;
        Object remover = "Vacio";
        if(primero != null){
            
            remover = ultimo.obtenerDato();
            if(primero == ultimo){
                
                primero = ultimo = null;
                
            } else {
                
                do{
                    
                    if(actual.obtenerSiguiente() == ultimo){
                        
                        actual.establecerSiguiente(null);
                        ultimo = actual;
                                                
                    }
                    
                    actual = actual.obtenerSiguiente();
                    
                }while(actual != null);
                
            }
            
        }
        
        return remover;
        
    }
    
    public void buscar(Object dato) throws ExceptionALista{
        
        Nodo buscar = primero;
        while(buscar != null){
            
            if(buscar.obtenerDato() == dato){
                
                System.out.println("Este nodo si fue encontrado");
                
            }
            
            buscar = buscar.obtenerSiguiente();
            
        }
        
    }
    
    public void mostrarLista() throws ExceptionALista{
        
        Nodo mostrar = primero;
        if(primero != null){
            
            while(mostrar != null){
                
                System.out.println("Info: " + mostrar.obtenerDato());
                mostrar = mostrar.obtenerSiguiente();
                
            }
            
        } else {
            
            System.out.println("Vacio");
            
        }
        
    }
    
    public void editar(Object dato, Object datoNuevo) throws ExceptionALista{
        
        Nodo editar = primero;
        while(editar != null){
            
            if(editar.obtenerDato() == dato){
                
                editar.establecerDato(datoNuevo);
                System.out.println("Nodo ha sido editado");
                
            }
            
            editar = editar.obtenerSiguiente();
            
        }
        
    }
    
    public int tamano() throws ExceptionALista{
        
        int tamano = 0;
        Nodo referencia = primero;
        if(primero != null){
            
            while(referencia != null){
                
                tamano++;
                referencia = referencia.obtenerSiguiente();
                
            }
            
        }
        
        return tamano;
        
    }
    
    public Object eliminar(Object dato) throws ExceptionALista{
        
        Nodo nuevoNodo = primero;
        Nodo anterior = null;
        Object eliminar = "Vacio";
        while(nuevoNodo != null){
            
            if(nuevoNodo.obtenerDato() == dato){
                
                if(nuevoNodo == primero){
                    
                    eliminar = primero.obtenerDato();
                    primero = primero.obtenerSiguiente();
                    
                } else {
                    
                    eliminar = nuevoNodo.obtenerDato();
                    anterior.establecerSiguiente(nuevoNodo.obtenerSiguiente());
                    
                }
                
            }
            
            anterior = nuevoNodo;
            nuevoNodo = nuevoNodo.obtenerSiguiente();
            
        }
        
        return eliminar;
        
    }
    
    private Nodo primero;
    private Nodo ultimo;
    
}
